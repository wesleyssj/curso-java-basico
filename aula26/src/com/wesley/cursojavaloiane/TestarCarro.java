package com.wesley.cursojavaloiane;

public class TestarCarro {

    public static void main(String[] args) {
	// write your code here
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();
        van.obterAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro através do método de retorno é: " + autonomia);
        System.out.println("ou");
        System.out.println("A autonomia do carro através do método de retorno é: " + van.obterAutonomia());
    }
}
