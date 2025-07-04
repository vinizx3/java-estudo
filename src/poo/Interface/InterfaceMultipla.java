package poo.Interface;
interface Interface1{
    void metodo1();
}
interface Interface2{
    void metodo2();
}
//interface 3 estende interface1 e interface2, Herança multipla
/* interface Interface3 extends Interface1, Interface2{
    void metodo3();
} */

// classe teste implementa interface 1 e interface2, Implementação multipla
abstract class Teste implements Interface1, Interface2{
    public void metodo1(){
        System.out.println("Metodo 1");
    }
    public void metodo2(){
        System.out.println("Metodo 2");
    }
    /* public void metodo3(){
        System.out.println("Metodo 3");
    } */
}

//estendendo uma classe abstrata implementando multiplas interfaces
public class InterfaceMultipla extends Teste{
    public static void main(String[] args) {

        InterfaceMultipla interfaceTeste = new InterfaceMultipla();
        interfaceTeste.metodo1();
        interfaceTeste.metodo2();

//        Teste teste = new Teste();
//        teste.metodo1();
//        teste.metodo2();
        // teste.metodo3();
    }
}
