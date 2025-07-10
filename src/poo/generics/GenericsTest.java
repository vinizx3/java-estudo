package poo.generics;
// <T> definição de uma classe genérica; T é o tipo de dado
class Box<T>{
    private T boxItem;

    public void storeItem(T boxItem){
        this.boxItem = boxItem;
    }
    public T takeItem(){
        return boxItem;
    }
}

public class GenericsTest {
    public static void main(String[] args) {
        //criando um objeto genérico para guardar Strings
        Box<String> text = new Box<>();
        text.storeItem("Texto genérico");
        System.out.println(text.takeItem());

        //criando um objeto genérico para guardar numeros
        Box<Integer> num = new Box<>();
        num.storeItem(33);
        System.out.println(num.takeItem());
    }
}
