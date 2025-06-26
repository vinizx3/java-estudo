package poo.heranca;
class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

}
class Estudante extends Pessoa{
    private int numeroMatricula;

    public Estudante(String nome, int idade, int numeroMatricula){
        super(nome, idade);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula(){
        return numeroMatricula;
    }
}

public class ex003 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("André",13,3123);
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Numero de matrícula: " + estudante.getNumeroMatricula());
    }
}
