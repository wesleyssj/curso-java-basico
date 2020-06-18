import java.util.Scanner;
public class exercicio04{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Digite a nota do primeiro bimestre: ");
     int nota1 = scan.nextInt();
     
     System.out.print("Agora digite a nota do segundo bimestre: ");
     int nota2 = scan.nextInt();
     
     System.out.print("Agora a nota do terceiro bimestre: ");
     int nota3 = scan.nextInt();
     
     System.out.print("Beleza, agora a nota do quarto bimestre: ");
     int nota4 = scan.nextInt();
     
     int somaTotal = nota1 + nota2 + nota3 + nota4;
     
     System.out.println("A média das suas notas é: " + (somaTotal / 4));
     
    }
}