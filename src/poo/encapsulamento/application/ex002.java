package poo.encapsulamento.application;

import poo.encapsulamento.entities.Funcionario;

public class ex002 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("ana", 5000);
        System.out.println(funcionario1.toString());

        //passagem por valor
        funcionario1.aumentarSalario(3000);
        System.out.println(funcionario1.toString());
        //passagem por referência
        funcionario1.alterarSalario(funcionario1, 6000);
        System.out.println(funcionario1.toString());
    }
}
