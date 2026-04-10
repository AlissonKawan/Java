package view;

import java.util.Scanner;

/**
 * Responsavel por entrada e saida de dados
 * não tem regra de negócio
 */
public class PedidoView {
    Scanner input = new Scanner(System.in);

    public String lercliente(){
        System.out.println("Cliente: ");
        return input.nextLine();
    }

    public double lerValor(){
        System.out.println("Valor R$: ");
        return input.nextDouble();
    }

    public void mostrarResumo(String resumo) {
        System.out.println("Resumo: " + resumo);
    }
}
