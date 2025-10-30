package Heranca2;

import java.util.Scanner;

public class SistemaUsuarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Administrador admin = new Administrador("", "", "");
        Cliente cliente = new Cliente("", "", "", "");

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Mostrar Dados do Cliente");
            System.out.println("3 - Deletar Cliente (Administrador)");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                cliente.cadastrar();

            } else if (opcao == 2) {
                // Usa o método exibirDados() da classe Cliente
                cliente.exibirDados();

            } else if (opcao == 3) {
                // Usa o método deletarUsuario() da classe Administrador
                System.out.println("=== LOGIN DO ADMINISTRADOR ===");
                admin.cadastrar(); // pede os dados do admin

                System.out.print("Digite a senha novamente para confirmar exclusão: ");
                String senhaDigitada = sc.nextLine();

                // Confere se a senha está correta
                if (senhaDigitada.equals(admin.senha)) {
                    admin.deletarUsuario(cliente);
                    cliente = new Cliente("", "", "", ""); // "reseta" o cliente
                } else {
                    System.out.println("Senha incorreta! Ação não permitida.");
                }

            } else if (opcao == 4) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        sc.close();
    }
}
/*Problemas do sistema: Pode colocar qualquer senha, Falta uma verificação para saber se o administrador realmente é administrador, para cadastrar posso colocar qualquer coisa ate numeros quando pede nome, posso cadastrar sem preencher nenhum campo, no geral é um sistema 100% imaginario, nada é real! */
