package by.tms.antonfedoseev.homework14.utils;

import java.math.BigDecimal;

public class ExchangeRate {
    private Currency currency;
    private BigDecimal rate;

    public ExchangeRate(Currency currency, BigDecimal rate) {

    }


    public ExchangeRate[] getTodayRate() {
        return new ExchangeRate[]{
                new ExchangeRate(Currency.USD, new BigDecimal("2,7890"));
        new ExchangeRate(Currency.EUR, new BigDecimal("2,9789"));
        new ExchangeRate(Currency.RUS, new BigDecimal("0,037773"));
        new ExchangeRate(Currency.CNY, new BigDecimal("4,0654"));
        new ExchangeRate(Currency.GBP, new BigDecimal("3,3538"));
    };


    }

}