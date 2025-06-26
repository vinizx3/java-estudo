package poo.heranca;
class Animal {
    public void comer(){
        System.out.println("O animal come");
    }
}
class Cachorro extends Animal{
    public void latir(){
        System.out.println("O cachorro come");
    }
}

public class TesteHeranca {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.latir();
        dog.comer();
    }
}
