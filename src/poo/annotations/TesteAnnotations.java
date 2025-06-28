package poo.annotations;
class Animal {
    public void fazerSom(){
        System.out.println("O animal faz um som");
    }
}
class Gato extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("O gato mia");
    }
}

public class TesteAnnotations {
    public static void main(String[] args) {
        Gato cat = new Gato();
        cat.fazerSom();
    }
}
