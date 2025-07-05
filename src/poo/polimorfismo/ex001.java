package poo.polimorfismo;
abstract class Veiculo1{
    private String placa;
    private String ano;

    public Veiculo1(String placa, String ano){
        this.placa = placa;
        this.ano = ano;
    }
    void exibirInformacoes(){
        System.out.println("Placa do veiculo:" + placa);
        System.out.println("Ano do veiculo:" + ano);
    }
}
class Onibus extends Veiculo1{
    int assentos;

    public Onibus(String placa, String ano, int assentos){
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    void exibirInformacoes() {
        super.exibirInformacoes();
    }
}
class Caminhao extends Veiculo1{
    int eixos;

    public Caminhao(String placa, String ano, int eixos){
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    void exibirInformacoes() {
        super.exibirInformacoes();
    }
}

public class ex001 {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("007", "2007", 7);
        Caminhao caminhao = new Caminhao("008", "2008", 8);

        onibus.exibirInformacoes();
        System.out.println("-----------");
        caminhao.exibirInformacoes();
    }
}
