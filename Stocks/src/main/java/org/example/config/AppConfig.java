package org.example.config;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AppConfig {
    public static final String URL = "https://scanner.tradingview.com/india/scan";
    private static final List<String> COLUMNS = Arrays.asList(
            "name", "description", "logoid", "update_mode", "type", "typespecs", "close", "pricescale",
            "minmov", "fractional", "minmove2", "currency", "change", "volume", "relative_volume_10d_calc",
            "market_cap_basic", "fundamental_currency_code", "price_earnings_ttm", "earnings_per_share_diluted_ttm",
            "earnings_per_share_diluted_yoy_growth_ttm", "dividends_yield_current", "sector.tr", "market", "sector",
            "recommendation_mark", "Perf.W", "Perf.1M", "Perf.3M", "Perf.6M", "Perf.YTD", "Perf.Y", "Perf.5Y",
            "Perf.10Y", "Perf.All", "Volatility.W", "Volatility.M", "gross_margin_ttm", "operating_margin_ttm",
            "pre_tax_margin_ttm", "net_margin_ttm", "free_cash_flow_margin_ttm", "return_on_assets_fq",
            "return_on_equity_fq", "return_on_invested_capital_fq", "research_and_dev_ratio_ttm",
            "sell_gen_admin_exp_other_ratio_ttm",
            "total_assets_fq", "total_current_assets_fq", "cash_n_short_term_invest_fq",
            "total_liabilities_fq", "total_debt_fq", "net_debt_fq", "total_equity_fq",
            "current_ratio_fq", "quick_ratio_fq", "debt_to_equity_fq",
            "cash_n_short_term_invest_to_total_debt_fq"
    );
    public static Map<String, Object> requestBody = Map.of(
            "columns", COLUMNS,
            "ignore_unknown_fields", false,
            "preset", "all_stocks",
            "sort", Map.of(
                    "sortBy", "name",
                    "sortOrder", "asc",
                    "nullsFirst", false
            )
    );
}
