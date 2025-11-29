package Main;

import java.util.Scanner;

public class ConsoleGUI {
    static Scanner sc = new Scanner(System.in);
    public static void init() {
        System.out.println("--Willkommen im Währungsrechner--\n" +
                           "1. Verfügbare Währungen anzeigen \n" +
                           "2. Währungsrechner\n" +
                           "3. Exit\n");
        System.out.print("> ");
        String input = sc.nextLine();
        switch (input) {
            case "1" -> {
                Currency.displayCurrencies();
            }
            case "2" -> {
                Calculator.currencyCalculator();
            }
            default -> {return;}
        }
        returnInit();
    }
    public static void returnInit() {
        System.out.println("Möchtest du zum Hauptmenü zurückkehren? (yes/no/y/n)");
        String input = sc.nextLine();
        switch (input) {
            case "yes", "y" -> init();
            case "no", "n" -> {}
        }
    }
}
