package poo.abstracao;
abstract class FiguraGeometrica{
    int b;
    int h;

    FiguraGeometrica(int b, int h){
        this.b = b;
        this.h = h;
    }

    abstract int calcularArea();
    abstract int calcularPerimetro();
}
class Retangulo extends FiguraGeometrica{
    Retangulo(int b, int h){
        super(b, h);
    }

    @Override
    int calcularArea() {
        return b * h;
    }
    @Override
    int calcularPerimetro() {
        return 2 * (b + h);
    }
}

public class ex001 {
    public static void main(String[] args) {
        Retangulo retanguloCalc = new Retangulo(9,2);

        System.out.println("Area do Retangulo: " + retanguloCalc.calcularArea());
        System.out.println("Perimetro do Retangulo: " + retanguloCalc.calcularPerimetro());
    }
}
