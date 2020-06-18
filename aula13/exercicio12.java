import java.util.Scanner;
public class exercicio12{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     double altura = scan.nextDouble();
     double resultado = ((72.7*altura)-58);
     
     System.out.println("Seu peso ideal é: "+resultado);
    }
}