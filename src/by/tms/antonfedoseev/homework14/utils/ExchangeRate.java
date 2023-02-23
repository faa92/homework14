package by.tms.antonfedoseev.homework14.utils;

import java.math.BigDecimal;

public class ExchangeRate {
    private Currency currency;
    private BigDecimal rate;

    public ExchangeRate(Currency currency, BigDecimal rate) {
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getRate() {
        return rate;
    }

}

