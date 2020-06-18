import java.util.Scanner;
public class exercicio02{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Digite um número qualquer(Positivo ou Negativo): ");
     int num = scan.nextInt();
     
     if(num == 0)
     {
         System.out.println("Neutralizado a numeração!!");
     }
     else if(num > 0)
     {
       System.out.println("Numeração positiva");    
     }
     else if(num < 0)
     {
       System.out.println("Numeração negativa");
     }
    }
}