package Exercicio01;

public class VendaLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Lampada mercado = new Lampada();
       mercado.marca = "OSRAN";
       mercado.modelo = "LED";
       mercado.potencia = 90;
       mercado.valor = 10.80;
       
       System.out.println("Olá bem vindo ao Supermercado Quero Quero, o seu produto LAMPADA " 
         + mercado.marca + " de " + mercado.modelo + " de potência " + mercado.potencia + " Watts, custa R$" 
         + mercado.valor);
	}

}
