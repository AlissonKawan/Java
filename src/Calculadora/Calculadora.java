package Calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        while(true) {
            System.out.println("Digite um numero: ");
            int numero = digite.nextInt();
            System.out.println("Digite mais um numero: ");
            int numero2 = digite.nextInt();
            System.out.println("Quer Somar, subtrair, multiplicar ou dividir?");
            String operacao = digite.next();
            if (operacao.equalsIgnoreCase("somar")) {
                int resultadoSoma = somar(numero, numero2);
                System.out.println("O resultado da soma é: " + resultadoSoma);
            } else if (operacao.equalsIgnoreCase("Subtrair")) {
                int resultadoSub = subtrair(numero, numero2);
                System.out.println("O resultado da subtração é : " + resultadoSub);
            } else if (operacao.equalsIgnoreCase("multiplicar")) {
                int resultadoMul = multiplicar(numero, numero2);
                System.out.println("O resultado da multiplicação é : " + resultadoMul);
            } else if (operacao.equalsIgnoreCase("dividir")) {
                double resultadoDiv = dividir(numero, numero2);
                System.out.println("O resultado da divisão é: " + resultadoDiv);
            }
            System.out.println("Deseja sair?");
            String sair = digite.next();
            if (sair.equalsIgnoreCase("sim")){
                System.out.println("Saindo...");
                break;
            }
        }
    }
    public static int somar(int numero, int numero2){
        return numero + numero2;
    }
    public static int subtrair(int numero, int numero2){
        return numero - numero2;
    }
    public static int multiplicar(int numero, int numero2){
        return numero * numero2;
    }
    public static double dividir(double numero, double numero2){
        return numero / numero2;
    }
}
