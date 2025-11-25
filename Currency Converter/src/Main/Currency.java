package Main;

public class Currency {
    String name;
    double dollarPrice;
    String regionOfOrigin;
    String currencySymbol;

    public Currency(String name, double dollarPrice, String currencySymbol) {
        this.name = name;
        this.dollarPrice = dollarPrice;
        this.currencySymbol = currencySymbol;
    }

    public static Currency euro = new Currency("Euro",1.1574, "€");
    public static Currency dollar = new Currency("Dollar", 1.0, "$");
    public static Currency chf = new Currency("Schweizer Franken", 1.2384, "CHF");
    public static Currency rubel = new Currency("Rubel", 0.0127, "₽");
    public static Currency yen = new Currency("Yen", 0.0064, "JP¥");
    public static Currency pfund = new Currency("Pfund", 1.3169, "£");
    public static Currency yuan = new Currency("Yuan", 0.1412, "CN¥");

    public static Currency[] currencies = {euro, dollar, chf, rubel, yen, pfund, yuan};

    static {
        euro.regionOfOrigin = "Europäische Union";
        dollar.regionOfOrigin = "USA";
        chf.regionOfOrigin = "Schweiz";
        rubel.regionOfOrigin = "Russland";
        yen.regionOfOrigin = "Japan";
        pfund.regionOfOrigin = "Vereinigtes Königreich";
        yuan.regionOfOrigin = "China";
    }

    public static double getDollarPrice(Currency currency) {
        return currency.dollarPrice;
    }

    public static void displayCurrency(Currency currency) {
        System.out.println("Währung: " + currency.name);
        System.out.println("Herkunft: " + currency.regionOfOrigin);
        System.out.println("Symbol: " + currency.currencySymbol);
        System.out.println("Dollar-Wechselkurs: " + currency.dollarPrice + " USD");
    }

    public static void displayCurrencies() {
        for (Currency currency: Currency.currencies) {
            System.out.println("--------------------");
            Currency.displayCurrency(currency);
        }
        System.out.println("--------------------");
    }
}
