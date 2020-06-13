package com.wesley.exercicio03;

import java.util.Scanner;

public class TestaAluno {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Entre com o nome do Aluno: ");
        aluno.setNome(scan.next());

        System.out.print("Entre com o nome do Curso: ");
        aluno.setNomeCurso(scan.next());
        //13:18
        System.out.print("Entre com a matrícula: ");
        aluno.setMatricula(scan.next());

        //Vamos entrar com o nome das Disciplinas, por ser uma array vamos utilizar um For para preencher os dados.
        for(int i = 0; i < aluno.getNomeDisciplinas().length; i++){
            System.out.print("Entre com a disciplina " + (i+1) + ": ");
            aluno.setNomeDisciplinaPos(i, scan.next());
        }

        for(int i = 0; i < aluno.getNotasDiscpiplinas().length; i++){
            System.out.println("Obtendo notas da discliplina " + aluno.getNomeDisciplinas()[i]);

            for(int j = 0; j < aluno.getNotasDiscpiplinas()[i].length; j++){
                System.out.print("Entre com a nota " + (j+1) + ": ");
                aluno.setNomePosIJ(i, j, scan.nextDouble());
            }

        }
        aluno.mostrarInfo();

        for(int i=0; i < aluno.getNomeDisciplinas().length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - Aprovado.");
            }else{
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - Reprovado.");
            }
        }
    }
}
