package org.example;

import java.util.Scanner;

public class CurrencyConverter {

    public static String convertCurrency() {

        double amount;
        String toCurrency, fromCurrency;
        double factor = 0;
        boolean iterate = false;

        double usd_to_eur = 0.92, eur_to_usd = 0.64, usd_to_gbp = 0.79, usd_to_jpy = 147.65;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to convert: ");
        amount = scanner.nextDouble();
        scanner.nextLine();

        do {
            System.out.print("Enter the source currency (USD, EUR, GBP, or JPY): ");
            fromCurrency = scanner.nextLine().toUpperCase();
            System.out.print("Enter the target currency (USD, EUR, GBP, or JPY): ");
            toCurrency = scanner.nextLine().toUpperCase();

            if (fromCurrency.equals(toCurrency)) {
                iterate = true;
                System.out.println("Source and target currency cannot be the same!");
            } else {
                iterate = false;
            }

        } while (iterate);

        switch (toCurrency + fromCurrency) {
            case "USDJPY":
                factor = usd_to_jpy;
                break;
            case "USDGBP":
                factor = usd_to_gbp;
                break;
            case "USDEUR":
                factor = usd_to_eur;
                break;
            case "EURUSD":
                factor = eur_to_usd;
                break;
            case "EURGBP":
                factor = eur_to_usd * usd_to_gbp;
                break;
            case "EURJPY":
                factor = eur_to_usd * usd_to_jpy;
                break;
            case "GBPUSD":
                factor = 1 / usd_to_gbp;
                break;
            case "GBPEUR":
                factor = 1 / usd_to_gbp * usd_to_eur;
                break;
            case "GBPJPY":
                factor = 1 / usd_to_gbp * usd_to_jpy;
                break;
            case "JPYUSD":
                factor = 1 / usd_to_jpy;
                break;
            case "JPYEUR":
                factor = 1 / usd_to_jpy * usd_to_eur;
                break;
            case "JPYGBP":
                factor = 1 / usd_to_jpy * usd_to_gbp;
                break;
            default:
                break;
        }
            return amount + " " + toCurrency + " is equal to " + calculateCurrency(amount, factor) + " " + fromCurrency;
        }

        private static double calculateCurrency ( double amount, double factor){
            return amount * factor;
        }

    }
