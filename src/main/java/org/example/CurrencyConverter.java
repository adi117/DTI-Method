package org.example;

import java.util.Scanner;

public class CurrencyConverter {

    public static String convertCurrency(){

        double amount;
        String toCurrency, fromCurrency;
        double factor = 0;

        double usd_to_eur = 0.92, eur_to_usd = 0.64, usd_to_gbp = 0.79, usd_to_jpy = 147.65;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to convert: ");
        amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the source currency (USD, EUR, GBP, or JPY): ");
        fromCurrency = scanner.nextLine().toUpperCase();
        System.out.print("Enter the target currency (USD, EUR, GBP, or JPY): ");
        toCurrency = scanner.nextLine().toUpperCase();


        switch (toCurrency+fromCurrency){
            case "USDJPY":
                factor = usd_to_jpy;
                break;
            case "USDGBP" :
                factor = usd_to_gbp;
                break;
            case "EURUSD" :
                factor = eur_to_usd;
                break;
            case "USD" :
                factor = usd_to_eur;
                break;
        }


        return amount + " " + toCurrency + " is equal to " + calculateCurrency(amount, factor) + " " + fromCurrency;
    }

    private static double calculateCurrency(double amount, double factor){
        return amount * factor;
    }

}
