package org.example.models.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.example.models.seralizer.StockDeserializer;

public class StockEntry {

    @JsonProperty("s")
    private String symbol;

    @JsonProperty("d")
    @JsonDeserialize(using = StockDeserializer.class)
    private Stock data;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Stock getData() {
        return data;
    }

    public void setData(Stock data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "symbol='" + symbol + '\'' +
                ", data=" + data +
                '}';
    }
}
