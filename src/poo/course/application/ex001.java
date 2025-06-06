package course.application;

import course.entities.Retangle;
import java.util.Locale;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangle retangle = new Retangle();

        System.out.println("Enter retangle width and height");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();

        System.out.printf("Area %.2f%nPerimeter %.2f%nDiagonal %.2f", retangle.Area(), retangle.Perimeter(), retangle.Diagonal());

        sc.close();
    }
}
