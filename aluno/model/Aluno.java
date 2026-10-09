package aluno.model;

public class Aluno {
    private String nome;
    private int matricula;
    private double notaFinal;

    public void setNome(String nm){
        this.nome = nm;
    }

    public String getNome(){
        return nome;
    }
    public void setMatricula(int mat){
        this.matricula = mat;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setNotaFinal(Double nfinal){
        this.notaFinal = nfinal;
    }

    public double getNotaFinal(){
        return notaFinal;
    }
}