package Alunos;

import java.util.Scanner;

public class Alunos {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;


    public Alunos (String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double calcularMedia(){
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public String getNome() {
        return nome;
    }
    public String resumo() {
        return "Nome: " + nome +
                "\nMédia: " + String.format("%.2f", calcularMedia()) +
                "\nStatus: " + (calcularMedia() >= 7 ? "Aprovado" : "Reprovado") +
                "\n------------------------";
    }
    public static Alunos criarAlunos(Scanner sc){
        System.out.println("Informe o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Informe a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double n3 = sc.nextDouble();
        sc.nextLine();
        return new Alunos(nome, n1, n2, n3);
    }


    public void aprovado(){
        if (calcularMedia() >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}

