package org.example;

import org.example.config.AppConfig;
import org.example.init.StartApplication;
import org.example.models.api.StockData;
import org.example.service.HttpClientService;
import org.example.service.HttpClientServiceImpl;
import org.example.service.StockDataService;
import org.example.service.StockDataServiceImpl;


import java.util.*;

public class Main {


    public static StockData main() {
        try {
            HttpClientService httpClientService = new HttpClientServiceImpl();
            StockDataService stockDataService = new StockDataServiceImpl(httpClientService);
            return StartApplication.run(AppConfig.URL, AppConfig.requestBody, stockDataService);
        } catch (Exception e) {
            System.err.println("Error running application: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
