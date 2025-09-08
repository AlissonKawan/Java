package Aula1;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

/**
 * Conceitos abordados
 * - Classe - modelo para criar objetos
 * - Objeto - instância de uma classe
 * - Encapsulamento - modificadores de acesso (public, private) para proteger os dados
 * - Métodos - comportamento da classe (funções)
 * - Método Construtor - método especial para inicializar objetos
 */

public class Pessoa {

    //atributos
     String nome; //cadeia de caracteres
      int idade;




    //método de teste (main)
    public static void main(String[] args){
        System.out.println("Minha classe pessoa");

        //criando um objeto da classe pessoa
        //<Classe> <objeto> = new <Classe>;
        Pessoa marcos = new Pessoa(); //instanciar um objeto da classe pessoa
        marcos.nome = "Marcos";
        marcos.idade = 21;
        System.out.println("Nome: " + marcos.nome);
        System.out.println("Idade: " + marcos.idade);

        Pessoa alisson = new Pessoa();
        System.out.println("Nome: " + alisson.nome);
        System.out.println("Idade: " + alisson.idade);

        //atribuir valores para os atributos
        alisson.nome = "Alisson";
        alisson.idade = 18;
        System.out.println("Nome: " + alisson.nome);
        System.out.println("Idade: " + alisson.idade);

        Pessoa sergio = new Pessoa();
        sergio.nome = "Sergio";
        sergio.idade = 25;
        System.out.println("Nome: " + sergio.nome);
        System.out.println("Idade: " + sergio.idade);

        //objetos são a materialização da classe


    }


}