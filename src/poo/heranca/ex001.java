package poo.heranca;
class Veiculo{
    public void acelerar(){
        System.out.println("veiculo acelerando");
    }
}
class Carro extends Veiculo{
    public void acelerar(){
        System.out.println("carro acelerando");
        super.acelerar();
    }
}

public class ex001 {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.acelerar();
    }
}
