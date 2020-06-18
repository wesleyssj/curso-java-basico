import java.util.Scanner;
public class exercicio03{
  public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     boolean infoValida = false;
     String nome, sexo, estadoCivil;
     int idade;
     double salario;
     
     do{
         System.out.print("Entre com o nome: ");
         nome = scan.next();
         
         if(nome.length() > 3){
           infoValida = true;
         }else{
             System.out.println("Nome precisa de no mínio 3 caracteres");
         }
        }while(!infoValida);
        
        infoValida = false;
        
     do{
         System.out.print("Entre com a idade: ");
         idade = scan.nextInt();
         
         if(idade >= 0 && idade <= 150){
           infoValida = true;
         }else{
             System.out.println("Idade precisa ser maior ou igual a 0 e menor ou igual a 150");
         }
        }while(!infoValida);   
        
        infoValida = false;
        
     do{
         System.out.print("Entre com o salário: ");
         salario = scan.nextDouble();
         
         if(salario > 0){
           infoValida = true;
         }else{
             System.out.println("Salário precisa ser maior que zero");
         }
        }while(!infoValida); 
        
        infoValida = false;
        
     do{
         System.out.print("Entre com seu Sexo(M ou F): ");
         sexo = scan.next();
         
         if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
           infoValida = true;
         }else{
             System.out.println("Sexo precisar ser F ou M");
         }
        }while(!infoValida);   
        
        infoValida = false;
       
     do{
         System.out.print("Entre com seu Estado Civil(s, c, v ,d): ");
         estadoCivil = scan.next();
         
         if(estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C")|| estadoCivil.equalsIgnoreCase("V")|| estadoCivil.equalsIgnoreCase("D")){
           infoValida = true;
         }else{
             System.out.println("Estado Civil incorreto, tente novamente.");
         }
        }while(!infoValida);  
        
        System.out.println("As seguintes informações foram coletadas: ");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " +estadoCivil);
        
     }
  }
