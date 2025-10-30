package Heranca2;

import java.util.Scanner;

class Cliente extends Usuario {
    String endereco;

    public Cliente(String nome, String email, String senha, String endereco) {
        super(nome, email, senha);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public void cadastrar() {
        super.cadastrar();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o endereço do cliente: ");
        endereco = sc.nextLine();
        System.out.println("Cliente cadastrado com sucesso!");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Endereço: " + endereco);
    }
}
