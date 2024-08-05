package org.example.input;

import org.example.models.StockInfo;
import org.example.models.response.Company;
import org.example.models.api.Stock;
import org.example.models.api.StockEntry;
import org.example.models.response.Sector;

import java.util.*;
import java.util.stream.Collectors;

public class InitialScreening extends StockInfo {

    public List<Stock> sectorWiseScreening;
    Double sectorTotalPriceEarningRatio;
    Double averagePriceEarning;
    public Map<String, Company> companyMap = new HashMap<>();
    public InitialScreening(){}
    public InitialScreening(String sector) {
        sectorWiseScreening = filterStockBasedSector(sector);
        sectorTotalPriceEarningRatio = findTotalPriceEarning();
        averagePriceEarning = sectorTotalPriceEarningRatio / sectorWiseScreening.size();
        compareStockSectorAverage();
    }

    public List<Stock> filterStockBasedSector(String sector) {
        return getStockData().getStockEntries().stream()
                .map(StockEntry::getData)
                .filter(data -> Objects.equals(data.getOverview().getSector(), sector))
                .toList();
    }

    private Double findTotalPriceEarning() {
        return this.sectorWiseScreening.stream()
                .map(stock -> stock.getOverview().getPriceEarningsTTM())
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    public void compareStockSectorAverage() {
        this.sectorWiseScreening
                .forEach(value -> {
                    if (value.getOverview().getPriceEarningsTTM() < averagePriceEarning) {
                        this.companyMap.put(value.getOverview().getName(), Company.UNDER_VALUED);
                    } else if (value.getOverview().getPriceEarningsTTM() > averagePriceEarning) {
                        this.companyMap.put(value.getOverview().getName(), Company.OVER_VALUED);
                    } else {
                        this.companyMap.put(value.getOverview().getName(), Company.REASONABLE_VALUED);
                    }
                });
    }
    public Set<String> sectorsList() {
        return getStockData().getStockEntries()
                .stream()
                .filter(stockEntry -> stockEntry.getData()
                        .getOverview().getSector() != null)
                .map(stockEntry -> stockEntry.getData()
                        .getOverview().getSector())
                .collect(Collectors.toSet());
    }

}
