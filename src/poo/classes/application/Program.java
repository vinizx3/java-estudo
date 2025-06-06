package poo.classes.application;

import poo.classes.entities.Person02;

public class Program {
    public static void main(String[] args) {
        Person02 pessoa = new Person02();
        pessoa.nome = "Matheus";
        pessoa.idade = 25;
        pessoa.sexo = 'M';

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);
     }
}
