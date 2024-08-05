package org.example.models.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockData {

    @JsonProperty("totalCount")
    private int totalCount;

    @JsonProperty("data")
    private List<StockEntry> stockEntries;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<StockEntry> getStockEntries() {
        return stockEntries;
    }


    @Override
    public String toString() {
        return "StockData{" +
                "totalCount=" + totalCount +
                ", stockEntries=" + stockEntries +
                '}';
    }
}