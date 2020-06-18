import java.util.Scanner;
public class exercicio02{
 public static void main(String[]args){
   Scanner scan = new Scanner(System.in);
     
     boolean userSenha = false;
     
     do{
         System.out.print("Digite seu nome de usuário: ");
         String user = scan.next();
         
         System.out.print("Digite sua senha: ");
         String senha = scan.next();
         
         if(user.equalsIgnoreCase(senha)){
             userSenha = false;
             System.out.println("O nome de usuário não pode ser igual a senha, tente novamente.");
         }else{
             userSenha = true;
             System.out.println("Usuário e senhas cadastradas!");
         }
     }while(!userSenha);
        
 }
}