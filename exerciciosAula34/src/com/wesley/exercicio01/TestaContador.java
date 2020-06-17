package com.wesley.exercicio01;

public class TestaContador {

    static void imprimirValor(){
        System.out.println("O valor é: " + Contador.obterValor());
    }

    public static void main(String[]args){

        imprimirValor();

        Contador.incrementar();

        imprimirValor();

        Contador.zerar();

        imprimirValor();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimirValor();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();

    }
}
