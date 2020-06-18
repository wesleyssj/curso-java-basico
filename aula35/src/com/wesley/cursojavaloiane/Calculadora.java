package com.wesley.cursojavaloiane;

public class Calculadora {
    //Elevar a potência x^n que é x*x*x*x*x*...(n vezes)
    public static int fatorialNaoRecursivo(int num){
        if(num == 0){
            return 1;
        }

        int total = 1;
        for(int i = num; i > 1; i--){
            total *= i;
        }

        return total;
    }

    public static int fatorialR(int num){

        if(num == 0){
            return 1;
        }

        return num * fatorialR(num-1);
    }
}
