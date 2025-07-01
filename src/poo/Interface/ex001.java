package poo.Interface;
interface Veiculo{
    void ligarMotor();
    void desligarMotor();
    default void buzinar(){
        System.out.println("Bi-bi");
    }
}
class Carro implements Veiculo{
    public void ligarMotor(){
        System.out.println("Ligando motor");
    }
    public void desligarMotor(){
        System.out.println("Desligando motor");
    }
}
class Moto implements Veiculo{
    public void ligarMotor(){
        System.out.println("Ligando motor");
    }
    public void desligarMotor(){
        System.out.println("Desligando motor");
    }
}

public class ex001 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligarMotor();
        carro.buzinar();
        carro.desligarMotor();

        Moto moto = new Moto();
        moto.ligarMotor();
        moto.buzinar();
        moto.desligarMotor();
    }
}
