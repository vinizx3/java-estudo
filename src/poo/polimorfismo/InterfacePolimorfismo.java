package poo.polimorfismo;
interface Veiculo{
    void acelerar();
    void drift();
}
class Civic implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("O civic está acelerando");
    }
    public void drift(){}
}
class Bmw implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("a bmw está acelerando");
    }
    public void drift(){
        System.out.println("A bmw está fazendo drift");
    }
}

public class InterfacePolimorfismo {
    public static void main(String[] args) {
        Veiculo meuCivic = new Civic();
        Veiculo minhaBmw = new Bmw();

        meuCivic.acelerar();
        minhaBmw.drift();
    }
}
