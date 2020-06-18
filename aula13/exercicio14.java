import java.util.Scanner;
public class exercicio14{
 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Digite o tamanho do seu arquivo(em megas): ");
     int tamanho = scan.nextInt();
     
     System.out.print("Agora digite a velocidade de sua internet(em mbps): ");
     int velocidade = scan.nextInt();
     
     int tempo = tamanho / velocidade;
     
     System.out.println("Tempo de download: "+tempo);
     
    }
}