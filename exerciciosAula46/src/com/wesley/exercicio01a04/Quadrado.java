package com.wesley.exercicio01a04;

public class Quadrado extends Figura2D{

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
        //eturn Math.pow(lado, 2);
    }
}
