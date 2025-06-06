package estruturas_condicionais;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        x = sc.nextInt();

        if (x < 12) {
            System.out.println("Bom Dia");
        } else if (x < 18) {
            System.out.println("Boa Tarde");
        } 	else {
            System.out.println("Boa Noite");
        }
    }
}
