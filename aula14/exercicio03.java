import java.util.Scanner;
public class exercicio03{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Digite seu sexo(M para Masculino e F para Feminino: ");
    String sexo = scan.next();
    
    if(sexo.equalsIgnoreCase("F"))
    {
       System.out.println("Seu sexo é Feminino");
    }
    else if(sexo.equalsIgnoreCase("M"))
    {
        System.out.println("Seu sexo é Masculino");
    }
    else 
    {
        System.out.println("Sexo inválido");
    }
  }
}