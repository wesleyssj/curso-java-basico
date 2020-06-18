import java.util.Scanner;
public class CalculoMetrosQuadrados{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a largura da área:");
        double larguraArea = scan.nextDouble();
      
        System.out.println("Digite o comprimento da área:");
        double comprimentoArea = scan.nextDouble();

        double resultado = (larguraArea * comprimentoArea);
        System.out.printf("A área tem %.2f Metros quadrados", resultado);
        
        System.out.println();
        
        double quantidadeP180 = (resultado / 2.16);
        System.out.printf("Quantidade de placas de 1,80: %.2f", quantidadeP180);
        
        System.out.println();  
        
        double quantidadeP240 = (resultado / 2.88);
        System.out.printf("Quantidade de placas de 2,40: %.2f", quantidadeP240);
        
        System.out.println(); 
        
        double perfil = ((comprimentoArea / 0.60) + (larguraArea / 3));
        System.out.printf("Quantidade perfil: %.2f", perfil);
        
        System.out.println(); 
        
        double presilhas = (perfil * 2);
        System.out.printf("Quantidade de presilias: %.2f", presilhas); 
        
        System.out.println(); 
    }
}