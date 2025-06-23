package poo.classes.application;

import poo.classes.entities.Carro;

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
