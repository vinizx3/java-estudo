package introducao.estruturas_condicionais;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("numero impar");
        }
        sc.close();
    }
}
