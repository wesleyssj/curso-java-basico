package com.wesley.cursojavaloiane;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaomenu(scan);

            if (opcao == 1) {//Consultar contato
                consultarContato(scan, agenda);
            } else if (opcao == 2) {//Adicionar contato
                adicionarContato(scan, agenda);
            }
        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        try{
            System.out.println("Criando um contato, entre com as informações:");
            String nome = leInformacaoString(scan, "Entre com o nome do contato:");
            String telefone = leInformacaoString(scan, "Entre com o telefone do contato");
            String email = leInformacaoString(scan, "Entre com o email do contato:");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        }catch(AgendaCheiaException e){
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }
    }


    public static void consultarContato(Scanner scan, Agenda agenda){
        String nomeContato = leInformacaoString(scan, "Entre com o nome do contato: ");
        try {
            if(agenda.consultaContatoPorNome(nomeContato) >= 0){
                System.out.println("Contato existe!");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String leInformacaoString(Scanner scan, String msg){
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaomenu(Scanner scan){

        boolean entradaValida = false;
        int opcao = 3;

        while(!entradaValida){
            System.out.println("Digite a opção desejada:");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair: ");

            try{
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

              if(opcao == 1 || opcao == 2 || opcao == 3){
                  entradaValida = true;
              }else{
                  throw new Exception("Entrada inválida!");
              }
            }
            catch(Exception e){
                System.out.println("Entrada inválida, tente novamente\n");
            }

        }

        return opcao;
    }
}
