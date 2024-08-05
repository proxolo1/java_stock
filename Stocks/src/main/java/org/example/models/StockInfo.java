package org.example.models;

import org.example.models.api.StockData;

public class StockInfo {
    private static StockData stockData;

    public static StockData getStockData() {
        return stockData;
    }

    public static void setStockData(StockData stockData) {
        StockInfo.stockData = stockData;
    }
}
