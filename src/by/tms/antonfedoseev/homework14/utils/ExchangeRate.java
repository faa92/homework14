package by.tms.antonfedoseev.homework14.utils;

import java.math.BigDecimal;

public class ExchangeRate {
    private final Currency currency;
    private final BigDecimal rate;

    public ExchangeRate(Currency currency, BigDecimal rate) {
        if (rate.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Invalid exchange rate");
        }
        this.currency = currency;
        this.rate = rate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getRate() {
        return rate;
    }

}

