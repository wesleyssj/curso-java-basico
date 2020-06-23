package com.wesley.exercicio01;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da Agenda");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);
        /*Pode fazer assim também.
        Agenda agenda = new Agenda();
        agenda.setNome(nome);*/


        Contato[] contatos = new Contato[3];
        for(int i = 0; i < 3; i++){
            System.out.println("Entre com as informações do contado " + (i+1));
            Contato c = new Contato();

            System.out.println("Entre com o nome: ");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email: ");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        if(agenda != null){
           System.out.println(agenda.obterInfo());
        }

    }
}
