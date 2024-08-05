from flask import Flask, request, jsonify
import google.generativeai as genai
from google.generativeai.types import HarmCategory, HarmBlockThreshold

app = Flask(__name__)

class Config:
    def get_gemini_api_key(self):
        return "AIzaSyDtfBz6O5XrRORvMlUlx5M8Tvhbha1LJIQ"

class Gemini:
    def __init__(self):
        config = Config()
        api_key = config.get_gemini_api_key()
        genai.configure(api_key=api_key)

    def inference(self, model_id: str, prompt: str) -> str:
        config = genai.GenerationConfig(temperature=0)
        model = genai.GenerativeModel(model_id, generation_config=config)
        safety_settings = {
            HarmCategory.HARM_CATEGORY_HATE_SPEECH: HarmBlockThreshold.BLOCK_NONE,
            HarmCategory.HARM_CATEGORY_HARASSMENT: HarmBlockThreshold.BLOCK_NONE,
        }
        response = model.generate_content(prompt, safety_settings=safety_settings)
        try:
            return response.text
        except ValueError:
            print("Prompt feedback:", response.prompt_feedback)
            print("Finish reason:", response.candidates[0].finish_reason)
            print("Safety ratings:", response.candidates[0].safety_ratings)
            return "Error: Unable to generate content from Gemini API"

@app.route('/generate', methods=['POST'])
def generate():
    data = request.get_json()
    model_id = "gemini-1.5-flash"
    prompt = "hello world"

    gemini = Gemini()
    result = gemini.inference(model_id, prompt)

    return jsonify({'result': result})

if __name__ == '__main__':
    app.run(debug=True)
