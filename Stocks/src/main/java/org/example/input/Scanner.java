package org.example.input;

import org.example.models.StockInfo;
import org.example.models.api.Performance;
import org.example.models.api.Stock;
import org.example.models.api.StockEntry;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static org.example.init.StartApplication.logger;

public class Scanner extends StockInfo {
    static java.util.Scanner scanner;
    static {
        scanner = new java.util.Scanner(System.in);
    }

    private final List<StockEntry> stockEntries = getStockData().getStockEntries();

    public void printStocks() {
        stockEntries.forEach(value -> logger.info(value.getData().toString()));
    }

    public List<String> findSector() {
        Set<String> sectorNames = getStockData().getStockEntries().stream().map(stockEntry -> {
            if (stockEntry.getData().getOverview().getSector() != null) {
                return stockEntry.getData().getOverview().getSector();
            }
            return "NA";
        }).collect(Collectors.toSet());
        return sectorNames.stream().toList();
    }

    public List<StockEntry> printSectorDetails(List<String> listNames) {
        int sectorNameIndex = scanner.nextInt();
        return getStockData().getStockEntries().stream()
                .filter(stockEntry -> Objects.equals(stockEntry.getData().getOverview().getSector(), listNames.get(sectorNameIndex)))
                .toList();
    }

    public List<StockEntry> filterBasedOnPriceAndPerformance() {
        return this.stockEntries.stream()
                .filter(stockEntry -> {
                    Stock stockData = stockEntry.getData();
                    return stockData.getOverview().getClose() <= 1000 && checkPerformance(stockData.getPerformance());
                }).toList();

    }

    public List<String> filterBasedOnSectorAndPerformance() {
        return this.stockEntries.stream()
                .filter(stockEntry -> {
                    Stock stockData = stockEntry.getData();
                    return stockData.getOverview().getClose() <= 1000 && checkPerformance(stockData.getPerformance()) && Objects.equals(stockData.getOverview().getSector(), "Technology Services");
                }).map(StockEntry::getSymbol).toList();
    }

    public static boolean checkPerformance(Performance performance) {
        Class<?> classes = performance.getClass();
        Method[] methods = classes.getDeclaredMethods();
        try {
            for (Method method : methods) {
                if (method.getName().startsWith("getP")) {
                    Double value = (Double) method.invoke(performance);
                    if (value != null && value < 0) {
                        return false;
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }



}
