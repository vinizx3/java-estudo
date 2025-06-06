package estruturas_condicionais;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hi,hf, d;

        hi = sc.nextInt();
        hf = sc.nextInt();

        if (hi < hf) {
            d = hf - hi;
        } else {
            d = 24 - hi + hf;
        }

        System.out.println("O jogo Durou: " + d + " Horas");
        sc.close();
    }
}
