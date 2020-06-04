package com.wesley.exercicio01;

public class TestaLampada {
    public static void main(String[]args){

        Lampada lampada = new Lampada();

        lampada.modelo = "spot";
        lampada.cor = "branca";
        lampada.potencia = 60;
        lampada.garantiaMeses = 6;
        lampada.tipoLuz = "led";
        lampada.tipoAbajur = false;
        lampada.tensao = "220 volts";

        lampada.tipos = new String[2];
        lampada.tipos[0] = "led";
        lampada.tipos[1] = "halógenas";

        System.out.println("Os dados de sua lâmpada são: Modelo: " + lampada.modelo + ", Cor: " + lampada.cor +
                ", Potência: " + lampada.potencia + " whatts, Garantia: " + lampada.garantiaMeses +
                " meses, Tipo de luz: " + lampada.tipoLuz + ", Tensão: " + lampada.tensao + ".");

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();
    }
}
