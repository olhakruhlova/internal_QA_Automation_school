package homeWorkLesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount in USD: ");

        double amountUsd = scanner.nextDouble();

        CurrencyConverter currencyConverter = new CurrencyConverter(0.01, 36.55);

        double totalAmountUah = currencyConverter.calculateTotalAmount(amountUsd);

        System.out.printf("Total amount: %.2f", totalAmountUah);

    }

}

