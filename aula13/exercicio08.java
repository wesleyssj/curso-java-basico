import java.util.Scanner;
public class exercicio08{
 public static void main(String[]args){
   Scanner scan = new Scanner(System.in);
   
   System.out.print("Quanto você ganha por hora? ");
   double salHora = scan.nextDouble();
   
   System.out.print("E quantas horas você trabalhou esse mês? ");
   double horaMes = scan.nextDouble();
   
   double total = salHora * horaMes;
   
   System.out.println("Ahhh você ganhou R$" + total + " no referido mês");
   
    }
}