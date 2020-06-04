package com.wesley.exercicio02;

public class ContaCorrente {

    String agencia, numero;
    double saldo, limiteEspecial, valorEspecialUsado;
    boolean especial;

    //Tem saldo na conta
    boolean realizarSaque(double quantiaASacar){
        if(saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        }else{//Não tem saldo na conta
            if(especial){
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if(limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false; //não é especial e não tem saldo suficiente
            }
        }
    }

    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}
