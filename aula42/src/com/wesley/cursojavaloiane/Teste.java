package com.wesley.cursojavaloiane;

public class Teste {

    public static void main(String[] args) {
	// write your code here

        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        System.out.println(Constantes.CURSO_COMPLETO);
        Constantes.URL_BLOG = "Teste de Substituição de variavel que seria constante";
        System.out.println(Constantes.URL_BLOG);
    }
}
