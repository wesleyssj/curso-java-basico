package com.wesley.cursojavaloiane;

public class Carro {
    //Para boas práticas, declare a Classe, depoisos atributoes e os métodos.
    //Dica para criar construtor no IntelliJ: Tecle Alt + Ins.

    String marca, modelo;
    int numPassageiros;
    double capCombustivel, consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(){
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando o construtor com 2 parâmetros");
    }

    void exibirAutonomia(){ //método
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado.");

        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km){ //double km é chamado de parâmetro.

        double qtdCombustivel = km / this.consumoCombustivel;

        return qtdCombustivel;
    }
}
