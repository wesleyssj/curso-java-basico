import java.util.Scanner;
public class exercicio05{
 public static void main(String[]args){
 Scanner scan = new Scanner(System.in);
 
 System.out.print("Digite o nome do aluno: ");
 String aluno = scan.next();
 
 System.out.print("Agora digite a nota do primeiro semestre do aluno: ");
 double nota1 = scan.nextDouble();
 
 System.out.print("Agora digite a nota do segundo semestre do aluno: ");
 double nota2 = scan.nextDouble();
 
 double media = (nota1 + nota2)/2;
 
 if(media >= 7 && media < 10)
 {
   System.out.println("Parabéns, você foi aprovado!");    
 }
 else if(media < 7)
 {
   System.out.println("Anão... infelizmente você foi reprovado!");    
 }
 else if(media == 10)
 {
   System.out.println("Carai borracha, você é bom mesmo em, Aprovado com Distinção!");    
 }     
 }
}