package by.tms.antonfedoseev.homework14;

import by.tms.antonfedoseev.homework14.utils.ExchangeService;

import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Exchange rate
                2. Calculate exchange
                0. Exit""");
        System.out.print("Enter task number: ");
        int taskNumber = scanner.nextInt();
        ExchangeService exchangeService = new ExchangeService();
        switch (taskNumber) {
            case 1 -> {
                System.out.println(exchangeService.getRate().toString());


            }
            case 2 -> {
            }
            case 0 -> {
            }
        }


    }
}
