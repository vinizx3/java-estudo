package poo.Interface;
interface Bebida{
    void bebida();
}
//interface pode extender outra interface
interface Cardapio extends Bebida{
    void prato(); // metodo abstrato
}
//implements é como se fosse um extends
class Lasanha implements Cardapio{
    public void prato(){
        System.out.println("Lasanha bolanhesa");
    }
    public void bebida() {
        System.out.println("Coca cola");
    }
}
class Strogonoff implements Cardapio{
    public void prato(){
        System.out.println("Strogonoff de carne");
    }
    public void bebida(){
        System.out.println("Suco de uva");
    }
}

public class TesteInterface {
    public static void main(String[] args) {
        Lasanha lasanha = new Lasanha();
        Strogonoff strogonoff = new Strogonoff();

        lasanha.prato();
        lasanha.bebida();
        strogonoff.prato();
        strogonoff.bebida();
    }
}
