package by.tms.antonfedoseev.homework14;

import by.tms.antonfedoseev.homework14.utils.Currency;
import by.tms.antonfedoseev.homework14.utils.ExchangeRate;
import by.tms.antonfedoseev.homework14.utils.ExchangeService;

import java.math.BigDecimal;
import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Exchange rate
                2. Calculate exchange
                0. Exit""");
        System.out.print("Enter task number: ");

        int taskNumber = Integer.parseInt(scanner.nextLine());

        ExchangeService exchangeService = new ExchangeService();

        switch (taskNumber) {
            case 1 -> {
                System.out.printf("%-16s %-10s %s\n", "Currency:", "Code:", "Course:");
                for (ExchangeRate i : ExchangeService.getTodayRate()) {
                    if (i.getCurrency() != Currency.BYN) {
                        System.out.format("%-24s %-10s %s", i.getCurrency().getRusName(), i.getCurrency(), i.getRate() + "\n");

                    }
                }
            }
            case 2 -> {
                System.out.print("Input currency: ");
                Currency inputCurrency = Currency.valueOf(scanner.nextLine());

                System.out.print("Input currency you need: ");
                Currency outputCurrency = Currency.valueOf(scanner.nextLine());

                System.out.print("Input amount: ");
                BigDecimal inputAmount = BigDecimal.valueOf(Integer.parseInt(scanner.nextLine()));

                System.out.println(ExchangeService.exchange(inputCurrency, inputAmount, outputCurrency));
            }
            case 0 -> {
                return;
            }
        }


    }
}
