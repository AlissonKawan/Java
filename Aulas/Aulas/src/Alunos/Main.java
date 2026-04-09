package Alunos;

import java.util.ArrayList;
import java.util.Scanner;

import static Alunos.Alunos.criarAlunos;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Alunos alisson = new Alunos("Alisson", 7, 9, 10);
        Alunos ricardo = new Alunos("Ricardo", 6, 8, 3);
        Alunos kawan = new Alunos("Kawan", 4, 6, 10);
        Alunos ana = new Alunos("Ana", 10, 10 ,1);

        ArrayList<Alunos> lista = new ArrayList<>();
        lista.add(alisson);
        lista.add(ana);
        lista.add(ricardo);
        lista.add(kawan);

        while(true){
            System.out.println("Ola Professor! quer: adicionar Alunos || Ver lista || ou não?");

            String confirma = sc.nextLine();

            if (confirma.equalsIgnoreCase("Adicionar alunos") || confirma.equalsIgnoreCase("Adicionar")) {
                Alunos aluno = criarAlunos(sc);
                lista.add(aluno);
                System.out.println("Aluno adicionado! \n");
                continue;
            }

            else if (confirma.equalsIgnoreCase("Nao") || confirma.equalsIgnoreCase("Não")){
                System.out.println("Tudo bem! sem adicionar alunos por enquanto!");
                break;
            }

            else if (confirma.equalsIgnoreCase("Ver lista")){
                System.out.println("Lista atual: ");
                for (Alunos turma : lista){
                    System.out.println(turma.resumo());
                }
                continue;
            }

            else{
                System.out.println("Digite apenas:  Adicionar, Ver lista, não !");
                continue;
            }
        }


    }
}
