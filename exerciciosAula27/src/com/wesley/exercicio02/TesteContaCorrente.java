package com.wesley.exercicio02;

public class TesteContaCorrente {
    public static void main(String[]args){

        ContaCorrente conta = new ContaCorrente();

        conta.agencia = "2495";
        conta.numero = "123316-1";
        conta.limiteEspecial = 500;
        conta.especial = true;
        conta.saldo = 10;
        conta.valorEspecialUsado = 0;

        System.out.println("Saldo da conta " + conta.numero + " = " + " R$" + conta.saldo);

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
