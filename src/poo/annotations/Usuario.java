package poo.annotations;
class Nome {
    @Deprecated
    public void userName(){
        System.out.println("Matheus");
    }
    public void novoUserName(){
        System.out.println("Gustavo");
    }
}

public class Usuario {
    @SuppressWarnings("deprecation") // suprime avisos específicos do compilador
    public static void main(String[] args) {
        Nome nomePessoa = new Nome();

        // uso metodo obsoleto
        nomePessoa.userName();
        nomePessoa.novoUserName();
    }
}
