import java.util.Scanner;
public class exercicio04{
 public static void main(String[]args){
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Digite uma letra qualquer: ");
  String letra = scan.next();
  
  if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u"))
  {
    System.out.println("Ora ora, temos uma vogal aqui!");
  }
  else
  {
    System.out.println("Hummm você digitou uma consoante!");    
  }
      
  }
 }