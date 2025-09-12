package Construtores;

public class Aluno {
    //atributos
    private int matricula;
    private String nome;
    private String curso;
    private boolean status;
    private float mediaGeral;

    //construtor
    public Aluno(){
    }
    //precisa ter o construtor vazio

    public Aluno(int matricula, String nome, String curso, boolean status){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.status = status;
        //esse é o meu construtor parametrizado
    }
    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }


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
    public void setStatus(Boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return this.status;
    }

    public float getMediaGeral() {
        return this.mediaGeral;
    }

    public void setMediaGeral(float mediaGeral) {
        this.mediaGeral = mediaGeral;
    }
    //metodo operacional simples
    public void calcularMedia(float n1, float n2, float n3){
        //estou definindo as variaveis/parametros no meu parenteses
        this.mediaGeral = (n1+n2+n3)/3;
    }

}
