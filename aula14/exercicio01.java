import java.util.Scanner;
public class exercicio01{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Digite um número qualquer: ");
     int num1 = scan.nextInt();
     
     System.out.print("Agora digite outro número qualquer: ");
     int num2 = scan.nextInt();
     
     if(num1 > num2)
       {
         System.out.println("O número maior é: "+num1);
       }
     else if(num2 > num1)
       {
         System.out.println("O número maior é: "+num2);
       }
     else if(num1 == num2)
     {
         System.out.println("Aí não né amigo, os números são iguais");
     }
    }
}