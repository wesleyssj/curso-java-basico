package com.wesley.exercicio03;

import java.util.Scanner;

public class TestaCalculadora {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int num;

        do {
            System.out.println("Entre com o número positivo.");
            num = scan.nextInt();

            if(num < 0){
                System.out.println("Número Inválido, tente novamente.");
            }

        } while (num<0);

        System.out.println(Calculadora.fatorial(num));
    }
}
