package com.wesley.cursojavaloiane;

public class Teste {

    public static void main(String[] args) {
	// write your code here

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);


        System.out.println(aluno);

        String s1 = "testestset";
        String s2 = "testestseT";

        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();

        aluno.setCurso("Ciência da Computação");
        double[] notas2 = {10, 9, 8, 7};
        aluno.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));

    }
}
