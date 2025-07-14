package poo.expressao_lambda;
@FunctionalInterface
interface MathOperation{
    double execute(double a, double b);
}

public class ex003 {
    public static void main(String[] args) {
        MathOperation largeNumber = (a, b) -> Math.pow(a, b);
        System.out.println("calculation: " + largeNumber.execute(2,5));

        MathOperation squareRoot = (a, b) -> Math.sqrt(a + b);
        System.out.println("calculation: " + squareRoot.execute(30,5));
    }
}
