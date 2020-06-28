package com.wesley.cursojavaloiane;

public class Professor {

    private double salario;
    private String nomeCurso;

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    public String getNomeCurso() {

        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {

        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){

        return 0;
    }

    public String obterEtiquetaEnderecio(){

        String s = "Endereço do Professor: ";
        //s += super.getEndereco();

        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco(){
        System.out.println("Imprimindo Endereço do Professor");
        System.out.println(this.obterEtiquetaEnderecio());
    }


}
