package com.wesley.cursojavaloiane;

public class Teste {

    public static void main(String[] args) {
	// write your code here

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua1, num1");
        aluno.setEndereco("Rua2, num2");
        professor.setEndereco("Rua3, num3");

        System.out.println(pessoa.obterEtiquetaEnderecio());
        System.out.println(aluno.obterEtiquetaEnderecio());
        System.out.println(professor.obterEtiquetaEnderecio());

    }
}
