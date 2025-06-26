package poo.heranca;
class Animal1 {
    public void fazerSom(){
        System.out.println("o animal faz um som");
    }
}
class Cachorro2 {
    public void fazerSom(){
        System.out.println("o cachorro faz um som");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Cachorro2 dog = new Cachorro2();

        dog.fazerSom();
    }
}
