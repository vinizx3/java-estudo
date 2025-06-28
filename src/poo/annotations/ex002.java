package poo.annotations;
class Calculadora {
    public int calcularSoma(int a, int b){
        return a + b;
    }
    @Deprecated
    public int calcularProduto(int a, int b){
        return a * b;
    }
}
public class ex002 {
    public static void main(String[] args) {
        Calculadora teste = new Calculadora();

        System.out.println(teste.calcularSoma(3,3));
        System.out.println(teste.calcularProduto(5,2));

    }
}
