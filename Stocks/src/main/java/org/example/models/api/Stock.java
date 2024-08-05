package org.example.models.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Stock {
    private final Overview overview;
    private final Performance performance;
    private final Profitability profitability;
    private final BalanceSheet balanceSheet;
    public Stock(List<Object> data) {
        this.overview = new Overview(data);
        this.performance = new Performance(data.get(25) != null ? ((Number) data.get(25)).doubleValue() : null,
                data.get(26) != null ? ((Number) data.get(26)).doubleValue() : null,
                data.get(27) != null ? ((Number) data.get(27)).doubleValue() : null,
                data.get(28) != null ? ((Number) data.get(28)).doubleValue() : null,
                data.get(29) != null ? ((Number) data.get(29)).doubleValue() : null,
                data.get(30) != null ? ((Number) data.get(30)).doubleValue() : null,
                data.get(31) != null ? ((Number) data.get(31)).doubleValue() : null,
                data.get(32) != null ? ((Number) data.get(32)).doubleValue() : null,
                data.get(33) != null ? ((Number) data.get(33)).doubleValue() : null,
                data.get(34) != null ? ((Number) data.get(34)).doubleValue() : null,
                data.get(35) != null ? ((Number) data.get(35)).doubleValue() : null
        );
        this.profitability = new Profitability(data);
        this.balanceSheet = new BalanceSheet(data);
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
            try {
                return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
    }


    public Overview getOverview() {
        return overview;
    }

    public Performance getPerformance() {
        return performance;
    }

    public Profitability getProfitability() {
        return profitability;
    }

    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }
}
