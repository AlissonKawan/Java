import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

    /*
    Entrada
    execução
    saida

    preciso criar um programa de pedra papel e tesoura para jogar contra o computador
    preciso que o computador escolha se ele é pedra papel ou tesoura
    logo em seguida quero que o computador peça a minha escolha
    se minha escolha for igual a dele... empate, vamos de novo
    se não for, decide o vencedor
    pedra>tesoura
    tesoura>papel
    papel>pedra
    em seguida o computador vai devolver a saida do ganhador. o programa não vai parar
    enquanto algúem não vencer.
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        while (true){
            int numeroAleatorio = random.nextInt(4);
            System.out.println("Digite um numero: 1-papel  2-tesoura  3-pedra");
            int escolha = sc.nextInt();
            if (escolha == numeroAleatorio){
                System.out.println("Empate! tente de novo!");
            }
            else{
                switch (escolha){
                    case 1:
                        if (numeroAleatorio == 2){
                            System.out.println("Sua escolha foi papel a minha foi tesoura");
                            System.out.println("Eu ganhei hahaahaha!");
                        } else if (numeroAleatorio == 3) {
                            System.out.println("sua escolha foi papel a minha foi pedra");
                            System.out.println("Eu perdi que ódio");

                        }break;
                    case 2:
                        if (numeroAleatorio == 1){
                            System.out.println("Você escolheu tesoura, eu escolhi papel");
                            System.out.println("Eu perdi que ódio");

                        }
                        else if (numeroAleatorio == 3){
                            System.out.println("Você escolheu tesoura, eu escolhi pedra");
                            System.out.println("HAHAHAH eu ganhei!!");
                        }break;
                    case 3:
                        if (numeroAleatorio == 1)  {
                            System.out.println("Você escolheu pedra, eu escolhi papel");
                            System.out.println("HAHAHAHAHAH ganhei");
                            break;
                        } else if (numeroAleatorio == 2) {
                            System.out.println("Você escolheu pedra, eu escolhi tesoura");
                            System.out.println("Droga, perdi!!");

                        }break;
                    default:
                        System.out.println("Empate vamos de novo!");
                }
            }

        }


    }
}
