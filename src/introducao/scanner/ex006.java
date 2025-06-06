package introducao.scanner;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("Triângulo: %.3f", triangulo);
        System.out.printf("%nCirculo: %.3f", circulo);
        System.out.printf("%nTrapézio: %.3f", trapezio);
        System.out.printf("%nQuadrado: %.3f", quadrado);
        System.out.printf("%nRetângulo: %.3f", retangulo);
        sc.close();
    }
}
