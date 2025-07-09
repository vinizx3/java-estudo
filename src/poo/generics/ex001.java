package poo.generics;
class Shark{
    private String name;
    private double length;

    public Shark(String name, double length){
        this.name = name;
        this.length = length;
    }

    public String getName(){
        return name;
    }
    public double getLength(){
        return length;
    }
}
class Turtle {
    private String name;
    private int age;

    public Turtle(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getNome(){
        return name;
    }
    public int getIdade(){
        return age;
    }
}
class Ocean<T>{
    private T content;
    public void storeAnimal(T animal){
        this.content = animal;
    }
    public T takeAnimal(){
        return content;
    }
}

public class ex001 {
    public static void main(String[] args) {
        Ocean<Shark> sharkOcean = new Ocean<>();
        sharkOcean.storeAnimal(new Shark("megalodon", 20.0));
        Shark shark = sharkOcean.takeAnimal();
        System.out.println("Name: " + shark.getName() + "\nLength: " + shark.getLength() + " meters");

        Ocean<Turtle> turtleOcean = new Ocean<>();
        turtleOcean.storeAnimal(new Turtle("Crush", 150));
        Turtle turtle = turtleOcean.takeAnimal();
        System.out.println("Name: " + turtle.getNome() + "\nAge: " + turtle.getIdade());
    }
}
