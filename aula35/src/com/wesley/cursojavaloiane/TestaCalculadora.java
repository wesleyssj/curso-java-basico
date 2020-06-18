package com.wesley.cursojavaloiane;

public class TestaCalculadora {

    public static void main(String[] args) {
	// write your code here

        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Calculadora.fatorialR(5);
        System.out.println(fatorialR);
    }
}
