package poo.classes.application;
class Carro{
    private String marca;
    private String modelo;
    private int ano;

    public Carro() {
    }
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

public class ex001 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.exibirDetalhes();

        Carro carro2 = new Carro("chevrolet","astra");
        carro2.exibirDetalhes();

        Carro carro3 = new Carro("honda", "civic ", 2009);
        carro3.exibirDetalhes();
    }
}