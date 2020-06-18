import java.util.Scanner;
public class exercicio10{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Digite sua temperatura em Celsius e vamos converte-lo para Farenheit: ");
     double c = scan.nextDouble();
     
     double f = ((c * 9/5)+32);
     
     System.out.println("O valor da temperatura em Farenheit é: " + f);
     
     
    }
}