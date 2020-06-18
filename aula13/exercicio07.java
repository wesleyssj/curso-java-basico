import java.util.Scanner;
public class exercicio07{
 public static void main (String[]args){
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Informe a largura de seu quadrado: ");
     double l = scan.nextDouble();
     double a = l * l;
     
     System.out.println("A área de seu quadrado é igual a: "+(a*2) +" cm²");
     
    }
}