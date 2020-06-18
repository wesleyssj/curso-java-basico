import java.util.Scanner;
public class exercicio03{
 public static void main(String[]args){
  Scanner scan = new Scanner(System.in);
 
  int[] vetorA = new int[15];
  int[] vetorB = new int[vetorA.length];
 
  for(int i=0; i<vetorA.length; i++){
   System.out.println("Entre com o valor da posição: "+i);
   vetorA[i] = scan.nextInt();
   
   vetorB[i] = vetorA[i] * vetorA[i];
  } 
  
  System.out.print("Vetor A = ");
  for(int i=0; i < vetorA.length; i++){
   System.out.println(vetorA[i] + " ");  
  }
  System.out.println();
  
  System.out.print("Vetor B = ");
  for(int i=0; i < vetorB.length; i++){
   System.out.println(vetorB[i] + " ");   
  }
  System.out.println();
 }
}