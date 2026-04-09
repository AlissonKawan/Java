package ex5;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        if (idade >= 0){
        this.idade = idade;}
        else {
            System.out.println("Coloque uma idade positiva");
        }

    }


    public int getIdade() {
        return idade;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public void verificarIdade(){
        if (idade >18){
            System.out.println(nome + " É maior de 18 anos");
        }
        else if (idade == 18){
            System.out.println(nome + " Tem 18 anos");
        }
        else {
            System.out.println(nome + " É menor de idade");
        }
    }
}
