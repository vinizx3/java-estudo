package poo.annotations;
class SuperClasse{
    //este metodo será sobrescrito na classe filha
    public void imprime(){
        System.out.println("Imprime");

    }
}
class MinhaClasse extends SuperClasse{
    @Override
    public void imprime(){
        System.out.println("Imprime diferente");
    }
}

public class ex001 {
    public static void main(String[] args) {
        MinhaClasse testeImprime = new MinhaClasse();

        testeImprime.imprime();
    }
}
