package switchcase;
import java.util.Scanner;

public class javacase {
    public static void main(String[] args) {

        System.out.println("\n >>> Primeiro exemplo SWITCH-CASE");

        //criando onbjeto da classe Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Dia da semana (1-7): ");
        //nextint é pq o valor é numero inteiro
        //tem varios tipos de next
        int dia = input.nextInt();

        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira!");
                break;
            case 3:
                System.out.println("Terça-Feira!");
                break;
            case 4:
                System.out.println("Quarta-Feira!");
                break;
            case 5:
                System.out.println("É hoje... Quinta Feira!");
                break;
            case 6:
                System.out.println("Sextooou!!!");
                break;
            case 7:
                System.out.println("Sabado finalmente!!!!");
                break;
            default:
                System.out.println("Fora da semana se liga!");
            }
        System.out.println("Fora do switch case até breve!!");
        }
}
