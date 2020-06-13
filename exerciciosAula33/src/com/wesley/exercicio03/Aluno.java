package com.wesley.exercicio03;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        nomeDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas, double[][] notasDiscpiplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDiscpiplinas() {
        return notasDisciplinas;
    }

    public void setNotasDiscpiplinas(double[][] notasDiscpiplinas) {
        this.notasDisciplinas = notasDiscpiplinas;
    }

    public void mostrarInfo(){
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + nomeCurso);
        System.out.println();

        for(int i = 0; i < notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina: " + nomeDisciplinas[i]);
            for(int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice){
        if(obterMedia(indice) >= 7){
            return true;
        }
        return false;
    }

    private double obterMedia(int indice) {
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }
        double media = soma / 4;

        return media;
    }

    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }

    public void setNomePosIJ(int posI, int posJ, double nota){
        this.notasDisciplinas[posI][posJ] = nota;
    }
}
