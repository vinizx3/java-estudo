package scanner;

import java.util.Locale;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num, hs;
        double S, R;

        num = sc.nextInt();
        hs = sc.nextInt();
        S = sc.nextDouble();
        R = hs * S;

        System.out.println("Number: " + num);
        System.out.printf("Salaray: %.2f", R);

        sc.close();
    }
}
