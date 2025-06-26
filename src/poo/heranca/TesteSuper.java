package poo.heranca;
class Animal3 {
    String nome;

    Animal3(String nome){
        this.nome = nome;
    }
}
class Cachorro3 extends Animal3{
    String raca;

    Cachorro3(String nome, String raca){
        super(nome);
        this.raca = raca;
    }
}

public class TesteSuper {
    public static void main(String[] args) {
        Cachorro3 dog = new Cachorro3("koda", "vira lata");
        System.out.println("O nome do cachorro é: " + dog.nome);
        System.out.println("A raça do cachorro é: " + dog.raca);
    }
}
