package com.wesley.cursojavaloiane;

public class MultiplosCatchJava7 {

    public static void main(String[] args) {
        // write your code here

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denon = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + denon[i] + " = " + (numeros[i]/denon[i]));
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Eita, aconteceu um erro!");
            }
        }
    }
}
