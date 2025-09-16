import java.util.Scanner;

public class Leitura {
    public static void main(String[] args){
        //scanner é uma forma de interação com o usuario
        // new é para criar a propiedade junto com scanner system in que quer dizer q essa propiedade vai ser aplicada no computador
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Eita seu filme favorito é: " + filme);

        System.out.println("Qual o ano de lançamento? ");
        int anoDelancamento = leitura.nextInt();
        System.out.println("Então o ano de lançamento é: " + anoDelancamento);

        System.out.println("Qual sua avaliação para o filme? ");
        double avaliacao = leitura.nextDouble();
        System.out.println("essa nota: " + avaliacao + " realmente é justa");

    }
}
