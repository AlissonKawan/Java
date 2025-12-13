import javax.swing.*;
import java.util.Scanner;

public class ProjetoContaBancaria {
    public static void main(String[] args) {
        System.out.println("\nOla bem vindo ao Banco do lindo Alisson!");
        Scanner scanner = new Scanner(System.in);

        String nome = "Alisson Kawan";
        String tipoDeConta = "Conta corrente";
        double saldoInicial = 1000;

        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo : " + saldoInicial);

        String menu = """
                Digite sua opção:
                1- Consultar Saldo
                2- Transferir Valor
                3- Receber Valor
                4- Sair
                """;

        int opcao = 0;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();


            if (opcao == 1) {
                System.out.println("\n Seu saldo é: \n" + saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja trasferir? ");
                double valor = scanner.nextDouble();
                if (valor > saldoInicial) {
                    System.out.println("Não há saldo para realizar a transferencia");
                } else {
                    saldoInicial -= valor;
                }
            }
            else if (opcao == 3){
                System.out.println("Qual o valor que deseja receber?");
                double valor = scanner.nextDouble();
                saldoInicial += valor;
            }
            else break;
        }
    }
}
