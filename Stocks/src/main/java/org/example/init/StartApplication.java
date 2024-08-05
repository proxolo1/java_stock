package org.example.init;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.config.AppConfig;
import org.example.input.InitialScreening;
import org.example.models.StockInfo;
import org.example.models.api.Stock;
import org.example.models.api.StockData;
import org.example.service.HttpClientService;
import org.example.service.HttpClientServiceImpl;
import org.example.service.StockDataService;
import org.example.service.StockDataServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StartApplication extends StockInfo {
    public static final Logger logger = LoggerFactory.getLogger(StartApplication.class);
    static HttpClientService httpClientService;

    static {
        try {
            httpClientService = new HttpClientServiceImpl();
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            throw new RuntimeException(e);
        }
    }

    static StockDataService stockDataService = new StockDataServiceImpl(httpClientService);



    public static StockData run(String apiUrl, Map<String, Object> requestBody, StockDataService stockDataService) throws Exception {
//        Banner.getBanner(logger);
        String jsonInputString = new ObjectMapper().writeValueAsString(requestBody);
        setStockData(stockDataService.fetchStockData(apiUrl, jsonInputString));
        return getStockData();
    }
    public static Set<String> SectorsList() throws Exception {
        InitialScreening screening = new InitialScreening();
        String jsonInputString = new ObjectMapper().writeValueAsString(AppConfig.requestBody);
        setStockData(stockDataService.fetchStockData(AppConfig.URL, jsonInputString));
        return screening.sectorsList();
    }
    public static List<Stock> filterBasedOnSectors(String sector) throws Exception {
        String jsonInputString = new ObjectMapper().writeValueAsString(AppConfig.requestBody);
        setStockData(stockDataService.fetchStockData(AppConfig.URL, jsonInputString));
        InitialScreening screening = new InitialScreening(sector);
        return screening.sectorWiseScreening;
    }
}
