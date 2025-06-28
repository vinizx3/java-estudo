package poo.annotations;
class InformaRegras{
    @Deprecated
    public void aposentadoriaAntiga(){
        System.out.println("Regras para aposentadoria");
    }

    public void aposentadoriaNova(){
        System.out.println("Novas regras para aposentadoria");
    }
}

public class Previdência {
    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();

        // Uso do metodo obsoleto (deprecated)
        regras.aposentadoriaAntiga();

        // uso do novo metodo
        regras.aposentadoriaNova();
    }
}
