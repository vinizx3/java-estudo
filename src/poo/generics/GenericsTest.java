package poo.generics;
// <T> definição de uma classe genérica; T é o tipo de dado
class Box<T>{
    private T boxItem;

    public void StoreItem(T boxItem){
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
        text.StoreItem("Texto genérico");
        String genericText = text.takeItem();
        System.out.println(genericText);

        //criando um objeto genérico para guardar numeros
        Box<Integer> num = new Box<>();
        Integer genericNum = Integer.valueOf(33);
        num.StoreItem(genericNum);
        Integer redeemedValue = num.takeItem();
        System.out.println(redeemedValue);
    }
}
