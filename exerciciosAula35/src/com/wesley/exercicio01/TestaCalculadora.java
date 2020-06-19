package com.wesley.exercicio01;

public class TestaCalculadora {

    public static void main(String[] args) {
	// write your code here

        for(int i = 1; i < 10; i++){
            System.out.print(Calculadora.fibonacci(i) + " ");
        }

        System.out.println(Calculadora.fibonacci(3));
    }
}
