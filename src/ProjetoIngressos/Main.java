package ProjetoIngressos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE INGRESSOS ===");

        // Simulação de cadastro do cliente
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        Cliente cliente = new Cliente(nome, senha);

        // Simulação de login
        System.out.println("\nVerificando cadastro...");
        if (cliente.getNome().isEmpty() || cliente.getSenha().isEmpty()) {
            System.out.println("❌ Cliente não cadastrado!");
            return;
        } else {
            System.out.println("✅ Cliente encontrado! Bem-vindo, " + cliente.getNome() + ".");
        }

        // Escolher evento
        Evento evento1 = new Evento("Show do Matue", 350.00);
        Evento evento2 = new Evento("Show do guns n roses", 280.00);

        System.out.println("\nEscolha o evento:");
        System.out.println("1 - " + evento1.getNome());
        System.out.println("2 - " + evento2.getNome());
        int opcEvento = sc.nextInt();
        sc.nextLine();

        Evento eventoEscolhido = (opcEvento == 1) ? evento1 : evento2;

        // Selecionar setor
        System.out.println("\nEscolha o setor: Comum / VIP / Camarote");
        String setor = sc.nextLine();

        // Verificar disponibilidade (imaginária)
        boolean ingressoDisponivel = true; // sempre disponível neste caso
        Plataforma plataforma = new Plataforma(cliente, ingressoDisponivel, setor);

        if (!plataforma.isIngressoDisponivel()) {
            System.out.println("❌ Ingresso esgotado para este setor!");
        } else {
            System.out.println("✅ Ingresso disponível!");

            // Escolher forma de pagamento
            System.out.println("\nEscolha a forma de pagamento: Pix / Crédito / Débito");
            String formaPagamento = sc.nextLine();
            Pagamento pagamento = new Pagamento(formaPagamento);

            // Exibir resumo final
            System.out.println("\n--- RESUMO DA COMPRA ---");
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Evento: " + eventoEscolhido.getNome());
            System.out.println("Setor: " + plataforma.getSetor());
            System.out.println("Forma de pagamento: " + pagamento.getForma());
            System.out.println("Valor: R$" + eventoEscolhido.getPreco());
            System.out.println("\n Compra finalizada com sucesso!");
        }

        sc.close();
    }
}
