package com.wesley.aula36;

public class TesteContato {

    public static void main(String[] args) {
	// write your code here

        Contato contato = new Contato();
        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");
        //contato.setTelefone("11 99999-9999");

        //Criar objeto endereço;
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("99999-165");

        contato.setEndereco(end);

        //Criar objeto telefone;
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("34");
        telefone.setNumero("9 9999 9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("34");
        telefone2.setNumero("5230 0000");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());

        /*if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " - " + contato.getTelefone().getNumero());
        }*/

        if(contato != null && contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }
    }
}
