package introducao.estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class atribuicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int min;
        double conta;
        min = sc.nextInt();
        conta = 50;

        if (min > 100){
            conta += (min - 100) * 2;
        }

        System.out.printf("Valor da conta: %.2f", conta);

        sc.close();
    }
}
