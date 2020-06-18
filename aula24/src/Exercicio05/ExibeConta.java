package Exercicio05;

public class ExibeConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "32316-1";
		conta.agencia = "2494";
		conta.especial = false;
		conta.limiteEspecial = 0.00;
		conta.saldo = 10316.00;	
		
		System.out.println("Bem vindo à Caixa Econômica Federal");
		
		System.out.println();
		
		System.out.println("Segue os dados da conta solicitada:");
		
		System.out.println();
		
		System.out.println("Conta Agência: " + conta.agencia + ", Número: " + conta.numero + ", com limite especial de: " 
		  + conta.limiteEspecial + ", e saldo de: " + conta.saldo + ".");
	}

}
