package introducao.scanner;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R, pi, A;
        pi = 3.14159;

        R = sc.nextDouble();
        A = pi * Math.pow(R, 2);

        System.out.println("A: " + A);
        sc.close();
    }
}
