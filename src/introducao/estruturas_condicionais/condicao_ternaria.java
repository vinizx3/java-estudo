package introducao.estruturas_condicionais;

import java.util.Scanner;

public class condicao_ternaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double discount = (price <= 20) ? price * 0.01 : price * 0.05;

        System.out.println(discount);

        sc.close();
    }
}
