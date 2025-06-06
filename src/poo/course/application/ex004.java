package course.application;

import course.util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the doller Price? ");
        double dolLarPrice = sc.nextDouble();
        System.out.println("How many dollars we be bought? ");
        double quantity = sc.nextDouble();
        double convertedValue = CurrencyConverter.DollarConverter(dolLarPrice, quantity);

        System.out.printf("Amount to be paind in reais = %.2f%n", convertedValue);

        sc.close();
    }
}
