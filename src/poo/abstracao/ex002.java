package poo.abstracao;
abstract class Loja {
    private String cnpj;
    private String razaoSocial;
    public boolean aberta;

    Loja(String cnpj, String razaoSocial){
        this .cnpj = cnpj;
        this .razaoSocial = razaoSocial;

    }

    public void abrir(){
        this.aberta = true;
    }
    public void fechar(){
        this.aberta = false;
    }

}
class LojaComercial extends Loja{
    LojaComercial(String cnpj, String razaoSocial){
        super(cnpj, razaoSocial);
    }
}

public class ex002 {
    public static void main(String[] args) {
        LojaComercial loja = new LojaComercial("237861095", "minha loja");
        loja.abrir();

        if (loja.aberta != true){
            System.out.println("status de loja: Fechada");
        } else {
            System.out.println("Status de loja: Aberta");
        }
        System.out.println("-----------------");
        loja.fechar();
        if (loja.aberta != true){
            System.out.println("status de loja: Fechada");
        } else {
            System.out.println("Status de loja Aberta");
        }
    }
}
