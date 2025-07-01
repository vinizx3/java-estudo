package poo.Interface;
interface ExemploMetodos {
    void metodoAbstrato();
    default void metodoDefault(){
        System.out.println("Este é um método Default na interface");
    }
    static void metodoStatic(){
        System.out.println("Este é um método static na interface");
    }
}

public class MetodosInterface implements ExemploMetodos{
    public void metodoAbstrato(){
        System.out.println("Este é um metodo abstrato");
    }
    public static void main(String[] args) {
        MetodosInterface testeMetodo = new MetodosInterface();
        testeMetodo.metodoAbstrato();
        testeMetodo.metodoDefault();
        ExemploMetodos.metodoStatic();
    }
}
