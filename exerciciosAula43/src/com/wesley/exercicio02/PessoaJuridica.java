package com.wesley.exercicio02;

public class PessoaJuridica extends Contribuinte{

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1; //10%
        //this.getRendaBruta()/100) * 10; //10%
    }

    @Override
    public String toString() {
        String s = "Pessoa Jurídica[";
        s = super.toString();
        s += " ;CNPJ: " + cnpj;
        s += " ;Imposto a ser pago: " + calcularImposto();
        s += "]";

        return s;
    }
}
