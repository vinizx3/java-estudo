package poo.imutabilidade;
final class ExemploFinal {
    //final é usado para definir uma constante
    final int NUM = 528;

    //metodo constante
    final void meuMetodo(){
        System.out.println("Este é um metodo final");
    }
}
    //não podemos extender classes constantes
/* class novoExemploFinal extends ExemploFinal{
    //não podemos sobrescrever metodos constantes
    void MeuMetodo(){
        System.out.println("Novo metodo final");
    }
} */

public class TesteFinal {
    public static void main(String[] args) {
        ExemploFinal testeFinal = new ExemploFinal();
        // membros constantes não pode ser mudado
        // testeFinal.NUM = 873;
        System.out.println(testeFinal.NUM);
        testeFinal.meuMetodo();
    }
}
