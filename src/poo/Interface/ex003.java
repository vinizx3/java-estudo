package poo.Interface;
interface Produto {
    String getNome();
    int getQuantidade();
    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
}
class ProdutoImpl implements Produto{
    private String nome;
    private int quantidade;

    public ProdutoImpl(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String getNome(){
        return nome = nome;
    }
    @Override
    public int getQuantidade(){
        return quantidade = quantidade;
    }
    @Override
    public void adicionarQuantidade(int quantidade){
        this.quantidade += quantidade;
    }
    @Override
    public void removerQuantidade(int quantidade){
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente no estoque");
        }
    }
}

public class ex003 {
    public static void main(String[] args) {
        ProdutoImpl produto = new ProdutoImpl("Cimento", 10);
        ProdutoImpl produto2 = new ProdutoImpl("Tinta", 15);
        ProdutoImpl produto3 = new ProdutoImpl("Tijolo", 30);
        System.out.println();

        System.out.println("Produto: " + produto.getNome());
        System.out.println("quantidade no estoque: " + produto.getQuantidade());
        produto.adicionarQuantidade(50);
        System.out.println("Quantidade no estoque: " + produto.getQuantidade());
        produto.removerQuantidade(20);
        System.out.println("Quantidade no estoque: " + produto.getQuantidade());
        System.out.println();

        System.out.println("Produtos em estoque: \n" + produto.getNome() + ": " + produto.getQuantidade() + "\n" + produto2.getNome() + ": " + produto2.getQuantidade() + "\n" + produto3.getNome() + ": " + produto3.getQuantidade());
    }
}
