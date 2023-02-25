package by.tms.antonfedoseev.homework14.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeService {
    private static final Currency BASE_CURRENCY = Currency.BYN;
    public static final BigDecimal RATE_BASE_CURRENCY = BigDecimal.ONE;

    public static ExchangeRate[] getTodayRate() {
        return new ExchangeRate[]{
                new ExchangeRate(Currency.BYN, BigDecimal.ONE),
                new ExchangeRate(Currency.USD, new BigDecimal("2.7890")),
                new ExchangeRate(Currency.EUR, new BigDecimal("2.9789")),
                new ExchangeRate(Currency.GBP, new BigDecimal("3.3538")),
                new ExchangeRate(Currency.RUS, new BigDecimal("0.037773")),
                new ExchangeRate(Currency.CNY, new BigDecimal("4.0654"))
        };
    }

    public static BigDecimal exchange(Currency startCurrency, BigDecimal cash, Currency endCurrency) {
        if (cash.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Invalid cash");
        }
        if (startCurrency == endCurrency) {
            return cash;
        }
        BigDecimal inputRate = BigDecimal.ZERO;
        BigDecimal outputRate = BigDecimal.ZERO;

        ExchangeRate[] rates = getTodayRate();
        for (ExchangeRate i : rates) {
            if (startCurrency == i.getCurrency()) {
                inputRate = i.getRate();
            }
            if (endCurrency == i.getCurrency()) {
                outputRate = i.getRate();
            }
        }
        return inputRate.multiply(cash).divide(outputRate, 2, RoundingMode.HALF_UP);
    }
}
    

