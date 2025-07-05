package poo.polimorfismo;
abstract class Operacao{
    int a,b;
    abstract int calcular(int a, int b);
}

class Soma extends Operacao{
    @Override
    int calcular(int a, int b) {
        return a + b;
    }
}
class Subtracao extends Operacao{
    @Override
    int calcular(int a, int b) {
        return a - b;
    }
}
class Multiplicao extends Operacao{
    @Override
    int calcular(int a, int b) {
        return a * b;
    }
}
class Divisao extends Operacao{
    @Override
    int calcular(int a, int b) {
        return a / b;
    }
}

public class ex002 {
    public static void main(String[] args) {
        Operacao calcular = new Soma();
        Operacao calcular2 = new Subtracao();
        Operacao calcular3 = new Multiplicao();
        Operacao calcular4 = new Divisao();

        System.out.println(calcular.calcular(3,5));
        System.out.println(calcular2.calcular(9,4));
        System.out.println(calcular3.calcular(5,2));
        System.out.println(calcular4.calcular(10,2));
    }
}
