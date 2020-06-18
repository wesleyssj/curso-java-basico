import java.util.Scanner;
public class exercicio05{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Digite os metros a ser convertidos em centímetros: ");
     double metros = scan.nextDouble();
     double cent = metros * 100;
     
     System.out.println(metros+" metros é igual a: "+cent+" centímetros.");
     
     
    }
}