package org.example.service;

import org.example.models.api.StockData;

public interface StockDataService {
    StockData fetchStockData(String apiUrl, String jsonInputString) throws Exception;
}
