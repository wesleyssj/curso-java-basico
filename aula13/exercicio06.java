import java.util.Scanner;
public class exercicio06{
 public static void main(String[]arsg){
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Digite o diâmetro do seu círculo: ");
     double diametro = scan.nextDouble();
     
     System.out.println("O valor do raio de seu círculo é: " + (diametro/2));
     
    }
}