package ex6Listas;

public class ArraysNumeros {
    public static void main(String[] args) {
        int soma = 0;

        int[] numeros = {5, 10 ,15, 20};


        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

System.out.println("O valor da somatoria de " + numeros[0]  + " + " +  numeros[1] + " + " + numeros[2] +  " + " + numeros[3] +  " = " + soma );



    }


}