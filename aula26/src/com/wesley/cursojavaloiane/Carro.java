package com.wesley.cursojavaloiane;

public class Carro {

    String marca, modelo;
    int numPassageiros;
    double capCombustivel, consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }
}
