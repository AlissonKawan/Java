import java.util.ArrayList;

import java.util.Scanner;

public class Testandoo {

    public static void main(String[] args) {
        ArrayList<String> clientes = new ArrayList();

        clientes.add("Alisson");
        clientes.add("João");
        clientes.add("David");
        clientes.add("Marcelinho do grau");
        clientes.add("Chico leiteiro");


        System.out.println("Lista dos clientes: \n");
        for(String cliente: clientes){
            System.out.println(cliente);
        }

        ArrayList<Integer> numeros = new ArrayList();
        Scanner input = new Scanner(System.in);

        int cont = 0;
        while (cont < 6) {
            System.out.println("Digite um numero para adicionar à lista: ");
            int valor = input.nextInt();
            numeros.add(valor);
            cont++;
        }
        System.out.println("Sua lista ficou assim: " + numeros);

        int soma = 0;
        for(int numero: numeros){
           int valor = numero;
           soma = valor + soma;
        } System.out.println("Soma dos numeros da lista deu: " + soma);
    }
}
