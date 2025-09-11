package Construtores;

public class Aluno {
    //atributos
    private int matricula;
    private String nome;
    private String curso;
    private boolean status;
    private float mediaGeral;

    //construtor


    //getter and setters

    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public String getNome(){
        return  this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    //is significa é, muito comum para funcções booleanas
    public boolean isStatus(){
        return this.status;
    }
    public void isStatus(Boolean status){
        this.status = status;
    }

    public float getMediaGeral() {
        return this.mediaGeral;
    }

    public void setMediaGeral(float mediaGeral) {
        this.mediaGeral = mediaGeral;
    }
}
