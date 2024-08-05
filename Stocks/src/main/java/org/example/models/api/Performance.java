package org.example.models.api;

public class Performance {
    protected Double perf1W;
    protected Double perf1M;
    protected Double perf3M;
    protected Double perf6M;
    protected Double perfYTD;
    protected Double perfY;
    protected Double perf5Y;
    protected Double perf10Y;
    protected Double perfAll;
    protected Double volatilityW;
    protected Double volatilityM;

    public Performance(Double perf1W, Double perf1M, Double perf3M, Double perf6M, Double perfYTD, Double perfY, Double perf5Y, Double perf10Y, Double perfAll, Double volatilityW, Double volatilityM) {
        this.perf1W = perf1W;
        this.perf1M = perf1M;
        this.perf3M = perf3M;
        this.perf6M = perf6M;
        this.perfYTD = perfYTD;
        this.perfY = perfY;
        this.perf5Y = perf5Y;
        this.perf10Y = perf10Y;
        this.perfAll = perfAll;
        this.volatilityW = volatilityW;
        this.volatilityM = volatilityM;
    }

    public Double getPerf1W() {
        return perf1W;
    }

    public void setPerf1W(Double perf1W) {
        this.perf1W = perf1W;
    }

    public Double getPerf1M() {
        return perf1M;
    }

    public void setPerf1M(Double perf1M) {
        this.perf1M = perf1M;
    }

    public Double getPerf3M() {
        return perf3M;
    }

    public void setPerf3M(Double perf3M) {
        this.perf3M = perf3M;
    }

    public Double getPerf6M() {
        return perf6M;
    }

    public void setPerf6M(Double perf6M) {
        this.perf6M = perf6M;
    }

    public Double getPerfYTD() {
        return perfYTD;
    }

    public void setPerfYTD(Double perfYTD) {
        this.perfYTD = perfYTD;
    }

    public Double getPerfY() {
        return perfY;
    }

    public void setPerfY(Double perfY) {
        this.perfY = perfY;
    }

    public Double getPerf5Y() {
        return perf5Y;
    }

    public void setPerf5Y(Double perf5Y) {
        this.perf5Y = perf5Y;
    }

    public Double getPerf10Y() {
        return perf10Y;
    }

    public void setPerf10Y(Double perf10Y) {
        this.perf10Y = perf10Y;
    }

    public Double getPerfAll() {
        return perfAll;
    }

    public void setPerfAll(Double perfAll) {
        this.perfAll = perfAll;
    }

    public Double getVolatilityW() {
        return volatilityW;
    }

    public void setVolatilityW(Double volatilityW) {
        this.volatilityW = volatilityW;
    }

    public Double getVolatilityM() {
        return volatilityM;
    }

    public void setVolatilityM(Double volatilityM) {
        this.volatilityM = volatilityM;
    }

    @Override
    public String toString() {
        return """
                {
                perf1W : %s,
                perf1M : %s,
                perf3M : %s,
                perf6M : %s,
                perfYTD : %s,
                perfY : %s,
                perf5Y : %s,
                perf10Y: %s,
                perfAll: %s,
                volatilityW: %s,
                volatilityM: %s
                """.formatted(
                this.perf1W,
                this.perf1M,
                this.perf3M,
                this.perf6M,
                this.perfYTD,
                this.perfY,
                this.perf5Y,
                this.perf10Y,
                this.perfAll,
                this.volatilityW,
                this.volatilityM
        );
    }
}
