import java.util.Scanner;
import java.text.DecimalFormat;
public class exercicio09{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     DecimalFormat df = new DecimalFormat("###,###.##");
     
     int[] vetorA = new int[10];
     int[] vetorB = new int[vetorA.length];
     double[] vetorC = new double[vetorA.length];
     
     for(int i = 0; i < vetorA.length; i++){
       System.out.println("Entre com o valor do vetorA da posição: " + i);
       vetorA[i] = scan.nextInt();
     }
     
     for(int i = 0; i < vetorB.length; i++){
       System.out.println("Entre com o valor do vetorB da posição: " + i);
       vetorB[i] = scan.nextInt();
     }
     
     for(int i = 0; i < vetorC.length; i++){
       vetorC[i] = vetorA[i] / vetorB[i];    
     }
     
     System.out.println("Valor de A: ");
     for(int i = 0; i < vetorA.length; i++){
       System.out.print(vetorA[i] + " ");    
     }
     
     System.out.println();
     
     System.out.println("Valor de B: ");
     for(int i = 0; i < vetorB.length; i++){
       System.out.print(vetorB[i] + " ");    
     }
     
     System.out.println();
     
     for(int i = 0; i < vetorC.length; i++){
       System.out.print(vetorC[i] + " ");    
     }
     
     System.out.println();
     
    }
}