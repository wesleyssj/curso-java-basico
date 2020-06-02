package com.wesley.cursojavaloiane;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do veículo é: " + capCombustivel * consumoCombustivel + " km.");
    }
}
