package introducao.estruturas_repetitivas;

public class ex006 {
    public static void main(String[] args) {

        int num = 10;
        int sum = 0;

        do {
            sum += num;
            num--;
        } while (num >= 0);

        System.out.println("A soma dos numero inteiros positivos é: " + sum);
    }
}
