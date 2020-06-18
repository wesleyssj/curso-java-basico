import java.util.Scanner;
public class exercicio11{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Digite um número inteiro: ");
     int iA = scan.nextInt();
     
     System.out.print("Agora digite outro inteiro: ");
     int iB = scan.nextInt();
     
     System.out.print("Agora digite um valor real: ");
     double rA = scan.nextDouble();
     
     double resultadoA = ((iA*2)*(iB/2));
     double resultadoB = ((iA*3)+rA);
     double resultadoC = ((rA*rA)*rA);
     
     System.out.println("Resposta da letra A: "+resultadoA);
     System.out.println("Resposta da letra B: "+resultadoB);
     System.out.println("Resposta da letra C: "+resultadoC);
    }
}