package com.wesley.cursojavaloiane;

public class TestandoFinally {

    public static void main(String[] args) {
	// write your code here
        try{
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[5] = 10;

            System.out.println("Esse texto não será impresso!");
        } catch(Exception e){
            System.out.println("Excecção ao acessar um índice do vetor que não existe");
        }

        System.out.println("Este texto será impresso após a exception");

    }
}
