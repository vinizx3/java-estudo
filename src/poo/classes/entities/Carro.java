package poo.classes.entities;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(){

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
