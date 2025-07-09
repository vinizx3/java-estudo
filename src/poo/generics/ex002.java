package poo.generics;
class RandomBox<T>{
    private T[] elements;

    public RandomBox(int capacity){
        elements = (T[]) new Object[capacity];
    }

    public void addElements(T element, int i) {
        elements[i] = element;
    }
    public T takeElement(int i){
        return elements[i];
    }
}

public class ex002 {
    public static void main(String[] args) {
        RandomBox<Double> pricesRandomBox = new RandomBox<>(3);
        pricesRandomBox.addElements(99.9,0);
        pricesRandomBox.addElements(98.9,1);
        System.out.println("Price 1: " + pricesRandomBox.takeElement(0));
        System.out.println("Price 2: " + pricesRandomBox.takeElement(1));

        RandomBox<Character> characterRandomBox = new RandomBox<>(2);
        characterRandomBox.addElements('a', 0);
        characterRandomBox.addElements('b', 1);
    }
}
