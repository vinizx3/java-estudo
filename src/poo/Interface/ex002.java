package poo.Interface;
interface Restaurante{
    void adicionarItem(String nome, double preco);
    double calcularTotal();
}
class Pedido implements Restaurante{
    private double total = 0;
    private String nome;

    @Override
    public void adicionarItem(String nome, double preco){
        this.nome = nome;
        System.out.println("Adicinando Item: " + nome + " R$ " + preco);
        total += preco;
    }
    @Override
    public double calcularTotal(){
        return total;
    }
}

public class ex002 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Hamburguer",  20);
        pedido.adicionarItem("Batata frita", 10);
        pedido.adicionarItem("refrigerante", 5);

        System.out.println("Valor total: R$ " + pedido.calcularTotal());
    }
}
