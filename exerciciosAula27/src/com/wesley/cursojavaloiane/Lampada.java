package com.wesley.cursojavaloiane;

public class Lampada {

    String modelo, tensao, cor, tipoLuz;
    String[] tipos;
    int potencia, garantiaMeses;
    boolean tipoAbajur, ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if(ligada){
            System.out.println("A lampada está ligada.");
        }else {
            System.out.println("A lampada está desligada");
        }
    }

    void mudarEstado(){
        if(ligada){
            desligar();
        }else{
            ligar();
        }
    }
}
