import java.util.Scanner;
public class exercicio09{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Digite a temperatura Farenheit: ");
     double f = scan.nextDouble();
     
     double c = (5*(f-32)/9);
     
     System.out.println("A Sua temperatura Farenheit convertida em Celsius é: " + c);
     
     
     
    }    
}