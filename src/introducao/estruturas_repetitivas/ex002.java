package estruturas_repetitivas;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

       int opcao = sc.nextInt();

        while (opcao != 4) {
            switch (opcao){
                case 1: {
                    alcool += 1;
                    break;
                }
                case 2: {
                    gasolina += 1;
                    break;
                }
                case 3: {
                    diesel += 1;
                    break;
                }
                default: {
                    System.out.println("opção inváliza");
                    break;
                }
            }
            opcao = sc.nextInt();
        }

        System.out.printf("Muito Obrigado %nAlcool: %d %nGasolina: %d %nDiesel: %d", alcool, gasolina, diesel);
        sc.close();
    }
}
