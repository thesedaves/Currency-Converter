package Main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat decimalFormat = new DecimalFormat();
    static {
        decimalFormat.setMaximumFractionDigits(2);
    }

    public static void currencyCalculator() {
        int index = 1;
        for (Currency currency: Currency.currencies) System.out.println(index++ + ". " + currency.name);
        System.out.println("Welche ist deine Ausgangsswährung?");
        System.out.print("> ");
        String initCurrInput = sc.nextLine();
        System.out.println("Welche ist deine Zielwährung?");
        System.out.print("> ");
        String targetCurrInput = sc.nextLine();
        Currency initCurrency = null;
        Currency targetCurrency = null;
        for (Currency currency: Currency.currencies) {
            if (initCurrInput.toLowerCase().trim().equals(currency.name.toLowerCase().trim())) {
                initCurrency = currency;
            }
            if (targetCurrInput.toLowerCase().trim().equals(currency.name.toLowerCase().trim())) {
                targetCurrency =  currency;
            }
        }
        assert initCurrency != null;
        if (initCurrency.equals(targetCurrency)) System.out.println("Die Zielwährung darf nicht die Ausgangswährung sein.");
        Calculator.currencyConverter(initCurrency, targetCurrency);
    }

    public static void currencyConverter(Currency initialCurr, Currency targetCurr) {
        double initialCurrDollar = Currency.getDollarPrice(initialCurr);
        double targetCurrDollar = Currency.getDollarPrice(targetCurr);

        System.out.print("\nBetrag in " + initialCurr.currencySymbol + ": ");
        double input = sc.nextDouble();
        double output = input * initialCurrDollar * 1 / targetCurrDollar;
        String outputString = decimalFormat.format(output) + targetCurr.currencySymbol;
        System.out.println(outputString);
    }
}
