package by.tms.antonfedoseev.homework14;

import by.tms.antonfedoseev.homework14.utils.Currency;
import by.tms.antonfedoseev.homework14.utils.ExchangeRate;

import java.math.BigDecimal;

public class HomeWork14 {
    public static void main(String[] args) {
        Currency currency = Currency.BYN;
        System.out.println(currency.toString());
        ExchangeRate rate = new ExchangeRate(Currency.USD, BigDecimal.valueOf(54646465456.33));


    }
}
