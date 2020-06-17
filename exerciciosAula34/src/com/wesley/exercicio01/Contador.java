package com.wesley.exercicio01;

public class Contador {

    private static int cont;

    public Contador(){
        cont++;
    }

    public static void incrementar(){
        Contador.cont++;
    }

    public static void zerar(){
        cont = 0;
    }

    public static int obterValor(){
        return cont;
    }

}
