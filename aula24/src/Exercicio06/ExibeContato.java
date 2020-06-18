package Exercicio06;

public class ExibeContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgendaCelular contato = new AgendaCelular();
		
		contato.nome = "Wesley Menezes Januário";
		contato.endereco = "Marli Dias Martins, 160";
		contato.email = "wesleyssjanuario@gmail.com";

		contato.telefones = new String[2];
		contato.telefones[0] = "(34) 9 9792 3984";
		contato.telefones[1] = "(34) 9 9209 2540";
		
		System.out.println("Dados contato: " + contato.nome + ", Endereco: " + contato.endereco + ", Email: " + contato.email + ", Telefones: "
		+ contato.telefones[0] + ", " + contato.telefones[1] + ".");		

	}

}
