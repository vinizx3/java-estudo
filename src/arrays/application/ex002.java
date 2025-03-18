package arrays.application;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas vão cadastradas? ");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        for (int i=0; i<n; i++){
            System.out.println("dados da " + (i+1) + " pessoa");
            System.out.print("Nome: ");
            names[i] = sc.next();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            System.out.print("Altura: ");
            heights[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i=0; i<n; i++){
            sum += heights[i];
        }
        double heightAvg = sum / n;

        System.out.printf("Average Heigth: %.2f%n", heightAvg);

        int count = 0;
        for (int i=0; i<n; i++) {
            if (ages[i] < 16) {
                count++;
            }
        }
        double percent = count * 100.0 / n;
        System.out.printf("person under 16 years old: %.1f%%%n", percent);

        for (int i=0; i<n; i++) {
            if (ages[i] < 16) {
                System.out.println(names[i]);
            }
        }
    }
}
