package org.example.models.api;

import java.util.List;

public class Overview {
    private String name;
    private String description;
    private String logoId;
    private String updateMode;
    private String type;
    private List<String> typeSpecs;
    private Double close;
    private int priceScale;
    private int minMov;
    private String fractional;
    private int minMove2;
    private String currency;
    private Double change;
    private int volume;
    private Double relativeVolume10dCalc;
    private Double marketCapBasic;
    private String fundamentalCurrencyCode;
    private Double priceEarningsTTM;
    private Double earningsPerShareDilutedTTM;
    private Double earningsPerShareDilutedYoYGrowthTTM;
    private Double dividendsYieldCurrent;
    private String sectorTr;
    private String market;
    private String sector;
    private Double recommendationMark;

    Overview(List<Object> data) {
        this.name = (String) data.get(0);
        this.description = (String) data.get(1);
        this.logoId = (String) data.get(2);
        this.updateMode = (String) data.get(3);
        this.type = (String) data.get(4);
        this.typeSpecs = (List<String>) data.get(5);
        this.close = data.get(6) != null ? ((Number) data.get(6)).doubleValue() : 0.0;
        this.priceScale = data.get(7) != null ? (Integer) data.get(7) : 0;
        this.minMov = data.get(8) != null ? (Integer) data.get(8) : 0;
        this.fractional = (String) data.get(9);
        this.minMove2 = data.get(10) != null ? (Integer) data.get(10) : 0;
        this.currency = (String) data.get(11);
        this.change = data.get(12) != null ? ((Number) data.get(12)).doubleValue() : 0.0;
        this.volume = data.get(13) != null ? ((Number) data.get(13)).intValue() : 0;
        this.relativeVolume10dCalc = data.get(14) != null ? ((Number) data.get(14)).doubleValue() : 0.0;
        this.marketCapBasic = data.get(15) != null ? ((Number) data.get(15)).doubleValue() : 0.0;
        this.fundamentalCurrencyCode = (String) data.get(16);
        this.priceEarningsTTM = data.get(17) != null ? ((Number) data.get(17)).doubleValue() : 0.0;
        this.earningsPerShareDilutedTTM = data.get(18) != null ? ((Number) data.get(18)).doubleValue() : 0.0;
        this.earningsPerShareDilutedYoYGrowthTTM = data.get(19) != null ? ((Number) data.get(19)).doubleValue() : 0.0;
        this.dividendsYieldCurrent = data.get(20) != null ? ((Number) data.get(20)).doubleValue() : 0.0;
        this.sectorTr = (String) data.get(21);
        this.market = (String) data.get(22);
        this.sector = (String) data.get(23);
        this.recommendationMark = data.get(24) != null ? ((Number) data.get(24)).doubleValue() : null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    public String getUpdateMode() {
        return updateMode;
    }

    public void setUpdateMode(String updateMode) {
        this.updateMode = updateMode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getTypeSpecs() {
        return typeSpecs;
    }

    public void setTypeSpecs(List<String> typeSpecs) {
        this.typeSpecs = typeSpecs;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public int getPriceScale() {
        return priceScale;
    }

    public void setPriceScale(int priceScale) {
        this.priceScale = priceScale;
    }

    public int getMinMov() {
        return minMov;
    }

    public void setMinMov(int minMov) {
        this.minMov = minMov;
    }

    public String getFractional() {
        return fractional;
    }

    public void setFractional(String fractional) {
        this.fractional = fractional;
    }

    public int getMinMove2() {
        return minMove2;
    }

    public void setMinMove2(int minMove2) {
        this.minMove2 = minMove2;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Double getRelativeVolume10dCalc() {
        return relativeVolume10dCalc;
    }

    public void setRelativeVolume10dCalc(Double relativeVolume10dCalc) {
        this.relativeVolume10dCalc = relativeVolume10dCalc;
    }

    public Double getMarketCapBasic() {
        return marketCapBasic;
    }

    public void setMarketCapBasic(Double marketCapBasic) {
        this.marketCapBasic = marketCapBasic;
    }

    public String getFundamentalCurrencyCode() {
        return fundamentalCurrencyCode;
    }

    public void setFundamentalCurrencyCode(String fundamentalCurrencyCode) {
        this.fundamentalCurrencyCode = fundamentalCurrencyCode;
    }

    public Double getPriceEarningsTTM() {
        return priceEarningsTTM;
    }

    public void setPriceEarningsTTM(Double priceEarningsTTM) {
        this.priceEarningsTTM = priceEarningsTTM;
    }

    public Double getEarningsPerShareDilutedTTM() {
        return earningsPerShareDilutedTTM;
    }

    public void setEarningsPerShareDilutedTTM(Double earningsPerShareDilutedTTM) {
        this.earningsPerShareDilutedTTM = earningsPerShareDilutedTTM;
    }

    public Double getEarningsPerShareDilutedYoYGrowthTTM() {
        return earningsPerShareDilutedYoYGrowthTTM;
    }

    public void setEarningsPerShareDilutedYoYGrowthTTM(Double earningsPerShareDilutedYoYGrowthTTM) {
        this.earningsPerShareDilutedYoYGrowthTTM = earningsPerShareDilutedYoYGrowthTTM;
    }

    public Double getDividendsYieldCurrent() {
        return dividendsYieldCurrent;
    }

    public void setDividendsYieldCurrent(Double dividendsYieldCurrent) {
        this.dividendsYieldCurrent = dividendsYieldCurrent;
    }

    public String getSectorTr() {
        return sectorTr;
    }

    public void setSectorTr(String sectorTr) {
        this.sectorTr = sectorTr;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Double getRecommendationMark() {
        return recommendationMark;
    }

    public void setRecommendationMark(Double recommendationMark) {
        this.recommendationMark = recommendationMark;
    }

    @Override
    public String toString() {
        return "Overview{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", logoId='" + logoId + '\'' +
                ", updateMode='" + updateMode + '\'' +
                ", type='" + type + '\'' +
                ", typeSpecs=" + typeSpecs +
                ", close=" + close +
                ", priceScale=" + priceScale +
                ", minMov=" + minMov +
                ", fractional='" + fractional + '\'' +
                ", minMove2=" + minMove2 +
                ", currency='" + currency + '\'' +
                ", change=" + change +
                ", volume=" + volume +
                ", relativeVolume10dCalc=" + relativeVolume10dCalc +
                ", marketCapBasic=" + marketCapBasic +
                ", fundamentalCurrencyCode='" + fundamentalCurrencyCode + '\'' +
                ", priceEarningsTTM=" + priceEarningsTTM +
                ", earningsPerShareDilutedTTM=" + earningsPerShareDilutedTTM +
                ", earningsPerShareDilutedYoYGrowthTTM=" + earningsPerShareDilutedYoYGrowthTTM +
                ", dividendsYieldCurrent=" + dividendsYieldCurrent +
                ", sectorTr='" + sectorTr + '\'' +
                ", market='" + market + '\'' +
                ", sector='" + sector + '\'' +
                ", recommendationMark=" + recommendationMark +
                '}';
    }
}
