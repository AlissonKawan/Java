package switchcase;

import java.util.Scanner;

public class javacase2 {
    public static void main(String[] args) {
             //exemplo 2 de switch case

        Scanner input =  new Scanner(System.in);

        System.out.println("Final da Placa: ");
        byte finalPlaca = input.nextByte();

        //exemplo com if
        System.out.println("\n >> if else =============");

        if (finalPlaca == 1 || finalPlaca == 2){
            System.out.println("Rodizio Segunda-Feira!");
        }else if (finalPlaca == 3 || finalPlaca == 4) {
            System.out.println("Rodizio Terça-Feira");
        }else if (finalPlaca == 5 || finalPlaca == 6){
            System.out.println("Rodizio Quarta-feira");
        }else if (finalPlaca == 9 || finalPlaca == 0) {
            System.out.println("Rodizio Sexta-feira");
        }else{
            System.out.println("Final de placa inválido!");
        }

        //exemplo com switch-case
        System.out.println("\n >> switch-case =============");

        switch (finalPlaca) {
            case 1:
            case 2:
                System.out.println("Rodízio Segunda-Feira!");
                break;
            case 3:
            case 4:
                System.out.println("Rodizio Terça-Feira!");
                break;
            case 5:
            case 6:
                System.out.println("Rodizio Quarta-Feira!");
                break;
            case 7:
            case 8:
                System.out.println("Rodizio Quinta-Feira");
                break;
            case 9:
            case 0:
                System.out.println("Rodizio Sexta-Feira");
                break;
            default:
                System.out.println("Final de placa invalido");

        }
        System.out.println("Rodizio finalizado!");



    }
}
