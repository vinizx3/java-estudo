package poo.abstracao;
abstract class Veiculo{
    int codigo = 35;

    Veiculo(int cod){
        codigo = cod;
    }

    abstract void acelerar();

}
class Caminhao extends Veiculo{
    Caminhao(int codigo){
        super(codigo);
    }
    void acelerar(){
        System.out.println("O caminhão está acelerando");
    }
    void freiar(){
        System.out.println("o caminhão está freiando");
    }
}

public class TesteAbstract {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao(777);

        System.out.println("Codigo: " + caminhao.codigo);

        caminhao.acelerar();
        caminhao.freiar();
    }
}
