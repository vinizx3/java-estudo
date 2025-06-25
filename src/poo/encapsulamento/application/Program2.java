package poo.encapsulamento.application;

public class Program2 {
    public static void exibirValor(int a){
        System.out.println("O valor inteiro é: " + a);
    }
    public static void exibirValor(String b){
        System.out.println("a string é: " + b);
    }
    // sobrecarga de metodos

    public static void main(String[] args) {
        exibirValor(1);
        exibirValor("eu");
    }
}
