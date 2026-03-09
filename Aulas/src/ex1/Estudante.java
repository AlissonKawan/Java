package ex1;

public class Estudante {

    //atributos:

    private String pessoa;
    private int idade;
    private double altura;


      //construtor:
    public Estudante(String pessoa, int idade, double altura){
        this.pessoa = pessoa;
        this.idade = idade;
        this.altura = altura;
    }
    public Estudante(){
    }
    public void apresentar(){
        System.out.println("Olá meu nome é: " + pessoa + " Tenho: " + idade + " Anos" + " Minha altura é: " + altura + "M");
    }
    public void envelhecer(int veio){
        this.idade+=veio;
    }

}