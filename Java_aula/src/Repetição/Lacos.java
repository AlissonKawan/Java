package Repetição;

import java.util.Scanner;

public class Lacos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("inicio: ");
        int inicio = input.nextInt();
        System.out.println("Fim: ");
        int fim = input.nextInt();

        int i = 0;
        for (int cont=inicio; cont<=fim; cont++){
            if (cont%2 == 0) {
                //System.out.println("Contador: " + cont);
                i++; //variavel acumuladora
            }
        }
        System.out.println("Quantidade de pares: " + i);
    }

}
