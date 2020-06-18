import java.util.Scanner;
public class exercicio01{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     boolean notaValida = false;
     
     do{
         System.out.print("Digite sua nota: ");
         double nota = scan.nextDouble();
         
         if(nota >= 0 && nota <= 10){
             notaValida = true;
             System.out.println("Você digitou: " + nota);
         }else{
             System.out.println("Nota inválida, tente novamente.");
         }
     } while (!notaValida);
    }
}