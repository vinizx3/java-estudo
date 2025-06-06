package poo.course.util;

public class CurrencyConverter {
    public static final double iof = 6.0;
    public static double dollarPrice;
    public static double Quantity;
    public static double DollarConverter(double dollarPrice, double quantity) {
        double value = dollarPrice * quantity;
        return value += value * iof / 100;
    }
}

