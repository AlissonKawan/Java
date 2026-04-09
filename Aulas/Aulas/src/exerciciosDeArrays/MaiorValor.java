package exerciciosDeArrays;

public class MaiorValor {
    public static void main(String[] args) {
        int[] numeros = {22, 10 ,90, 20};
        int maior = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("O maior valor dos numeros da array é: " + maior);
    }
}
