import java.util.Scanner;

public class Leitura {
    public static void main(String[] args){
        //scanner é uma forma de interação com o usuario
        // new é para criar a propiedade junto com scanner system in que quer dizer q essa propiedade vai ser aplicada no computador
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media de avaliações: " + mediaAvaliacao/3);




        System.out.println("Qual sua avaliação para o filme? ");
        double avaliacao = leitura.nextDouble();
        System.out.println("essa nota: " + avaliacao + " realmente é justa");

    }
}
