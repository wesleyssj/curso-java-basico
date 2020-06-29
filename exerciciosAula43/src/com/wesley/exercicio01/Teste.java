package com.wesley.exercicio01;

public class Teste {

    public static void main(String[] args) {
	// write your code here

        System.out.println("*** Teste Conta Bancária ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("11111");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("*** Teste Conta Poupança ***");

        ContaPoupanca contaPoupança = new ContaPoupanca();
        contaPoupança.setNomeCliente("Cliente Conta Poupança");
        contaPoupança.setNumConta("22222");
        contaPoupança.setDiaRendimento(29);

        contaPoupança.depositar(100);

        realizarSaque(contaPoupança, 50);

        realizarSaque(contaPoupança, 70);

        if(contaPoupança.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo de: " + contaPoupança.getSaldo());
        }else{
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado.");
        }


        System.out.println(contaPoupança);

        System.out.println("*** Teste Conta Especial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);

        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);

    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if(conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        }else{
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }
}
