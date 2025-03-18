package scanner;

import java.util.Locale;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int c1, c2, qt1, qt2;
        double p1, p2, t;

        c1 = sc.nextInt();
        qt1 = sc.nextInt();
        p1 = sc.nextDouble();
        c2 = sc.nextInt();
        qt2 = sc.nextInt();
        p2 = sc.nextDouble();
        t = p1* qt1 + p2 * qt2;

        System.out.printf("Valor a pagar: %.2f", t);
        sc.close();
    }
}
