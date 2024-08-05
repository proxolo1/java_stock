package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.models.api.StockData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.nio.charset.StandardCharsets;

public class StockDataServiceImpl implements StockDataService {
    private final Logger logger = LoggerFactory.getLogger(StockDataServiceImpl.class);
    private final HttpClientService httpClientService;
    private final ObjectMapper objectMapper;

    public StockDataServiceImpl(HttpClientService httpClientService) {
        this.httpClientService = httpClientService;
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public StockData fetchStockData(String apiUrl, String jsonInputString) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(apiUrl))
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonInputString, StandardCharsets.UTF_8))
                .build();

        HttpResponse<String> response = httpClientService.sendRequest(request);
        return objectMapper.readValue(response.body(), StockData.class);
    }
}
