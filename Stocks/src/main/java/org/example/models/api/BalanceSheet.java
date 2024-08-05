package org.example.models.api;

import java.util.List;

public class BalanceSheet {
private Double totalAsset;
private Double totalCurrentAsset;
private Double cashOnHand;
private Double totalLiabilities;
private Double totalDebt;
private Double netDebt;
private Double totalEquity;
private Double currentRatio;
private Double quickRatio;
private Double debtEquity;
private Double cashDebit;
BalanceSheet(List<Object> data) {
    this.totalAsset = data.get(46) != null ? ((Number) data.get(46)).doubleValue() : 0.0;
    this.totalCurrentAsset = data.get(47) != null ? ((Number) data.get(47)).doubleValue() : 0.0;
    this.cashOnHand = data.get(48) != null ? ((Number) data.get(48)).doubleValue() : 0.0;
    this.totalLiabilities = data.get(49) != null ? ((Number) data.get(49)).doubleValue() : 0.0;
    this.totalDebt = data.get(50) != null ? ((Number) data.get(50)).doubleValue() : 0.0;
    this.netDebt = data.get(51) != null ? ((Number) data.get(51)).doubleValue() : 0.0;
    this.totalEquity = data.get(52) != null ? ((Number) data.get(52)).doubleValue() : 0.0;
    this.currentRatio = data.get(53) != null ? ((Number) data.get(53)).doubleValue() : 0.0;
    this.quickRatio = data.get(54) != null ? ((Number) data.get(54)).doubleValue() : 0.0;
    this.debtEquity = data.get(55) != null ? ((Number) data.get(55)).doubleValue() : 0.0;
    this.cashDebit = data.get(55) != null ? ((Number) data.get(55)).doubleValue() : 0.0;
}
    public Double getTotalAsset() {
        return totalAsset;
    }

    public void setTotalAsset(Double totalAsset) {
        this.totalAsset = totalAsset;
    }

    public Double getTotalCurrentAsset() {
        return totalCurrentAsset;
    }

    public void setTotalCurrentAsset(Double totalCurrentAsset) {
        this.totalCurrentAsset = totalCurrentAsset;
    }

    public Double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(Double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public Double getTotalLiabilities() {
        return totalLiabilities;
    }

    public void setTotalLiabilities(Double totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    public Double getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(Double totalDebt) {
        this.totalDebt = totalDebt;
    }

    public Double getNetDebt() {
        return netDebt;
    }

    public void setNetDebt(Double netDebt) {
        this.netDebt = netDebt;
    }

    public Double getTotalEquity() {
        return totalEquity;
    }

    public void setTotalEquity(Double totalEquity) {
        this.totalEquity = totalEquity;
    }

    public Double getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(Double currentRatio) {
        this.currentRatio = currentRatio;
    }

    public Double getQuickRatio() {
        return quickRatio;
    }

    public void setQuickRatio(Double quickRatio) {
        this.quickRatio = quickRatio;
    }

    public Double getDebtEquity() {
        return debtEquity;
    }

    public void setDebtEquity(Double debtEquity) {
        this.debtEquity = debtEquity;
    }

    public Double getCashDebit() {
        return cashDebit;
    }

    public void setCashDebit(Double cashDebit) {
        this.cashDebit = cashDebit;
    }

    @Override
    public String toString() {
        return "BalanceSheet{" +
                "totalAsset=" + totalAsset +
                ", totalCurrentAsset=" + totalCurrentAsset +
                ", cashOnHand=" + cashOnHand +
                ", totalLiabilities=" + totalLiabilities +
                ", totalDebt=" + totalDebt +
                ", netDebt=" + netDebt +
                ", totalEquity=" + totalEquity +
                ", currentRatio=" + currentRatio +
                ", quickRatio=" + quickRatio +
                ", debtEquity=" + debtEquity +
                ", cashDebit=" + cashDebit +
                '}';
    }
}
