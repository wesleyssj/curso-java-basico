package com.wesley.cursojavaloiane;

public class Carro {
    //Para boas práticas, declare a Classe, depoisos atributoes e os métodos.

    String marca, modelo;
    int numPassageiros;
    double capCombustivel, consumoCombustivel;

    Carro(){
        System.out.println("Teste de construtor");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;

    }

    void exibirAutonomia(){ //método
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){ //double km é chamado de parâmetro.

        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;
    }
}
