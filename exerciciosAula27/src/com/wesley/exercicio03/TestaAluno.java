package com.wesley.exercicio03;
import java.util.Scanner;
public class TestaAluno {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Entre com o nome do Aluno: ");
        aluno.nome = scan.next();

        System.out.print("Entre com o nome do Curso: ");
        aluno.curso = scan.next();
        //13:18
        System.out.print("Entre com a matrícula: ");
        aluno.matricula = scan.next();

        //Vamos entrar com o nome das Disciplinas, por ser uma array vamos utilizar um For para preencher os dados.
        for(int i = 0; i < aluno.disciplina.length; i++){
            System.out.print("Entre com a disciplina " + (i+1) + ": ");
            aluno.disciplina[i] = scan.next();
        }

        for(int i = 0; i < aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da discliplina " + aluno.disciplina[i]);

            for(int j = 0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.print("Entre com a nota " + (j+1) + ": ");
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }

        }
        aluno.mostrarInfo();

        for(int i=0; i < aluno.disciplina.length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.disciplina[i] + " - Aprovado.");
            }else{
                System.out.println("Disciplina " + aluno.disciplina[i] + " - Reprovado.");
            }
        }
    }
}
