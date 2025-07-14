package poo.expressao_lambda;
@FunctionalInterface
interface FunctionalCalculator {
    double calc(double a, double b);
}

public class FunctionalProgramming {
    public static void main(String[] args) {
        FunctionalCalculator sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.calc(10,5));
        FunctionalCalculator sub = (a, b) -> a - b;
        System.out.println("Sub: " + sub.calc(10,5));
        FunctionalCalculator mult = (a, b) -> a * b;
        System.out.println("mult: " + mult.calc(10,5));
        FunctionalCalculator div = (a, b) -> a / b;
        System.out.println("div: " + div.calc(10,5));
    }

}
