package com.wesley.exercicio02;

public class TestaContaCorrente {
    public static void main(String[]args){

        ContaCorrente conta = new ContaCorrente();

        conta.setNumero(null);
        conta.setAgencia(null);
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(-10);

        System.out.println("Saldo da conta " + conta.getNumero() + " = " + " R$" + conta.getSaldo());

        System.out.println();

        boolean saqueEfetuado = conta.realizarSaque(10);

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        }else{
            System.out.println("Não foi possível realizar saque. Saldo Insuficiente!");
        }

        System.out.println();

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais.");

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        }else{
            System.out.println("Não foi possível realizar saque. Saldo insuficiente.");
        }

        System.out.println();

        System.out.println("Depósito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        System.out.println();

        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        }else{
            System.out.println("Não está usando cheque especial");
        }
    }
}
