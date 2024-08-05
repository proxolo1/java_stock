package org.example.models.seralizer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.models.api.Stock;

import java.io.IOException;
import java.util.List;

public class StockDeserializer extends JsonDeserializer<Stock> {

    @Override
    public Stock deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectMapper mapper = (ObjectMapper) p.getCodec();
        JsonNode node = mapper.readTree(p);
        // Convert JsonNode to List of Objects
        List<Object> data = mapper.convertValue(node, List.class);
        return new Stock(data);
    }
}
