package com.wesley.exercicio01;

public class TestaLampada {

    public static void main(String[] args) {
	// write your code here

        Lampada lampada = new Lampada();

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();
    }
}
