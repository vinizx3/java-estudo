package estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double wage, tax;

        wage = sc.nextDouble();

        if (wage <= 2000.0) {
            tax = 0.0;
        } else if (wage <= 3000.0) {
            tax = (wage - 2000.0) * 0.8;
        } else if (wage <= 4500.0) {
            tax = (wage - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            tax = (wage - 4500.0) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (tax == 0.0) {
            System.out.println("isento");
        } else {
            System.out.printf("%.2f%n", tax);
        }
        sc.close();
    }
}
