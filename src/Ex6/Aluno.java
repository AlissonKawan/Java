package Ex6;

public class Aluno {
    private int matricula;
    private String nome;
    private String turma;
    private float media;

    public Aluno(int matricula, String nome, String turma, float media){
        this.matricula = matricula;
        this.media = media;
        this.nome = nome;
        this.turma = turma;
    }
    public Aluno(){};

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    //metodo para chamar todos os dados de uma vez só
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", turma='" + turma + '\'' +
                ", media=" + media +
                '}';
    }
}
