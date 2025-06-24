package poo.encapsulamento.entities;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public String toString(){
        return "nome: " + nome + "\nsalario: " + salario;
    }
    //passagem por valor
    public void aumentarSalario(double aumento){
        salario += aumento;
    }

    //passagem por referência
    public void alterarSalario(Funcionario func, double novoSalario){
        func.salario = novoSalario;
    }
}
