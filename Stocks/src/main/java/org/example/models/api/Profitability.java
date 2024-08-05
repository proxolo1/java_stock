package org.example.models.api;

import java.util.List;

public class Profitability {
    private double grossMarginTtm;
    private double operatingMarginTtm;
    private double preTaxMarginTtm;
    private double netMarginTtm;
    private double freeCashFlowMarginTtm;
    private double returnOnAssetsFq;
    private double returnOnEquityFq;
    private double returnOnInvestedCapitalFq;
    private double researchAndDevRatioTtm;
    private double sellGenAdminExpOtherRatioTtm;

    public Profitability(List<Object> data) {
        this.grossMarginTtm = data.get(36) != null ? ((Number) data.get(36)).doubleValue() : 0.0;
        this.operatingMarginTtm = data.get(37) != null ? ((Number) data.get(37)).doubleValue() : 0.0;
        this.preTaxMarginTtm = data.get(38) != null ? ((Number) data.get(38)).doubleValue() : 0.0;
        this.netMarginTtm = data.get(39) != null ? ((Number) data.get(39)).doubleValue() : 0.0;
        this.freeCashFlowMarginTtm = data.get(40) != null ? ((Number) data.get(40)).doubleValue() : 0.0;
        this.returnOnAssetsFq = data.get(41) != null ? ((Number) data.get(41)).doubleValue() : 0.0;
        this.returnOnEquityFq = data.get(42) != null ? ((Number) data.get(42)).doubleValue() : 0.0;
        this.returnOnInvestedCapitalFq = data.get(43) != null ? ((Number) data.get(43)).doubleValue() : 0.0;
        this.researchAndDevRatioTtm = data.get(44) != null ? ((Number) data.get(44)).doubleValue() : 0.0;
        this.sellGenAdminExpOtherRatioTtm = data.get(45) != null ? ((Number) data.get(45)).doubleValue() : 0.0;
    }

    // Getters and Setters
    public double getGrossMarginTtm() {
        return grossMarginTtm;
    }

    public void setGrossMarginTtm(double grossMarginTtm) {
        this.grossMarginTtm = grossMarginTtm;
    }

    public double getOperatingMarginTtm() {
        return operatingMarginTtm;
    }

    public void setOperatingMarginTtm(double operatingMarginTtm) {
        this.operatingMarginTtm = operatingMarginTtm;
    }

    public double getPreTaxMarginTtm() {
        return preTaxMarginTtm;
    }

    public void setPreTaxMarginTtm(double preTaxMarginTtm) {
        this.preTaxMarginTtm = preTaxMarginTtm;
    }

    public double getNetMarginTtm() {
        return netMarginTtm;
    }

    public void setNetMarginTtm(double netMarginTtm) {
        this.netMarginTtm = netMarginTtm;
    }

    public double getFreeCashFlowMarginTtm() {
        return freeCashFlowMarginTtm;
    }

    public void setFreeCashFlowMarginTtm(double freeCashFlowMarginTtm) {
        this.freeCashFlowMarginTtm = freeCashFlowMarginTtm;
    }

    public double getReturnOnAssetsFq() {
        return returnOnAssetsFq;
    }

    public void setReturnOnAssetsFq(double returnOnAssetsFq) {
        this.returnOnAssetsFq = returnOnAssetsFq;
    }

    public double getReturnOnEquityFq() {
        return returnOnEquityFq;
    }

    public void setReturnOnEquityFq(double returnOnEquityFq) {
        this.returnOnEquityFq = returnOnEquityFq;
    }

    public double getReturnOnInvestedCapitalFq() {
        return returnOnInvestedCapitalFq;
    }

    public void setReturnOnInvestedCapitalFq(double returnOnInvestedCapitalFq) {
        this.returnOnInvestedCapitalFq = returnOnInvestedCapitalFq;
    }

    public double getResearchAndDevRatioTtm() {
        return researchAndDevRatioTtm;
    }

    public void setResearchAndDevRatioTtm(double researchAndDevRatioTtm) {
        this.researchAndDevRatioTtm = researchAndDevRatioTtm;
    }

    public double getSellGenAdminExpOtherRatioTtm() {
        return sellGenAdminExpOtherRatioTtm;
    }

    public void setSellGenAdminExpOtherRatioTtm(double sellGenAdminExpOtherRatioTtm) {
        this.sellGenAdminExpOtherRatioTtm = sellGenAdminExpOtherRatioTtm;
    }

    @Override
    public String toString() {
        return "Profitability{" +
                "grossMarginTtm=" + grossMarginTtm +
                ", operatingMarginTtm=" + operatingMarginTtm +
                ", preTaxMarginTtm=" + preTaxMarginTtm +
                ", netMarginTtm=" + netMarginTtm +
                ", freeCashFlowMarginTtm=" + freeCashFlowMarginTtm +
                ", returnOnAssetsFq=" + returnOnAssetsFq +
                ", returnOnEquityFq=" + returnOnEquityFq +
                ", returnOnInvestedCapitalFq=" + returnOnInvestedCapitalFq +
                ", researchAndDevRatioTtm=" + researchAndDevRatioTtm +
                ", sellGenAdminExpOtherRatioTtm=" + sellGenAdminExpOtherRatioTtm +
                '}';
    }
}
