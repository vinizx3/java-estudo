package introducao.variaveis;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int idade = 25;
        int idade2 = 19;
        String nome = "vinicius";
        double salario = 1000.0;
        double x = 10.357892;

        System.out.println(idade);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.println("Vinicius tem " + idade2 + " anos");
        System.out.printf("Resultado = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade2, salario);
    }
}
