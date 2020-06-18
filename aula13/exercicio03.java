import java.util.Scanner;
public class exercicio03{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Digite um número qualquer: ");
     int numero = scan.nextInt();
     
     System.out.print("Certo agora digite outro número qualquer: ");
     int numero2 = scan.nextInt();
     
     System.out.println("A soma dos dois números que você digitou é: "+(numero+numero2));
    }    
}