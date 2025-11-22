package Listas;

public class Main {
    public static void main(String[] args) {

        int [] numeros;

         numeros = new int[5];

        // Atribui valores aos elementos individualmente
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Primeiro numero da array: " + numeros[0]);
        System.out.println("Ultimo numero da array: " + numeros[4]);

        Lista vamo = new Lista();

        vamo.run();



    }
}
