package com.wesley.cursojavaloiane;

public class Aluno  {

    private String curso;
    private double[] notas;

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {

        return curso;
    }

    public void setCurso(String curso) {

        this.curso = curso;
    }

    public double[] getNotas() {

        return notas;
    }

    public void setNotas(double[] notas) {

        this.notas = notas;
    }

    public double calcularMedia(){

        return 0;
    }

    public boolean verificarAprovado(){

        return true;
    }

    public void metodoQualquer(){
        //super.setCpf("08854785840");

        //this.setCpf("123141212");
    }

    public String obterEtiquetaEnderecio(){

        String s = "Endereço do Aluno: ";
        //s += super.getEndereco();

        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco(){
        System.out.println("Imprimindo Endereço do Professor");
        System.out.println(this.obterEtiquetaEnderecio());
    }


}
