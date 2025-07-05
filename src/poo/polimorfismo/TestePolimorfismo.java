package poo.polimorfismo;
abstract class Animal{
    public abstract void fazerSom();
}
class Bode extends Animal{
    @Override
    public void fazerSom() {
        System.out.println("O bode faz: beee");
    }
}
class Vaca extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("A vaca faz: muuu");
    }
}


public class TestePolimorfismo {
    public static void main(String[] args) {
        //forma 1
        //polimorfismo declara a superclasse instanciando a subclasse
        Animal meuBode = new Bode();
        Animal minhaVaca = new Vaca();
        meuBode.fazerSom();
        minhaVaca.fazerSom();
        System.out.println("------------------");

        //forma 2
        //declarando object instanciando a subclasse
        Object meuBode1 = new Bode();
        Object minhaVaca1 = new Vaca();

        //casting da subclasse
        Bode bodeObj = (Bode) meuBode1;
        bodeObj.fazerSom();
        Vaca vacaObj = (Vaca) minhaVaca1;
        vacaObj.fazerSom();
        System.out.println("----------------");

        //forma 3
        //Convertendo a subclasse em objeto
        ((Bode) meuBode1).fazerSom();
        ((Vaca) minhaVaca1).fazerSom();
    }
}
