package Heranca;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Criando Usuários no Sistema ---");

        //1. instancia do Cliente
        Cliente joao = new Cliente("João", "joao@gmail.com", "123", true, 0);

        //2. Instância do Administrador
        Administrador ana = new Administrador("Ana", "ana@gmail.com", "1234", true,  "Senior");

        //3. Instância de Funcionário
        Funcionario pedro = new Funcionario("Pedro", "pedro@gmail.com", "135", true, "F007", "Desenvolvimento" );

        //cliente usa método de cliente
        joao.fazerPedido();
        joao.visualizarPerfil();

        //pedro que é um funcionario usa métodos de funcionario
        pedro.registrarPonto();
        pedro.visualizarPerfil();

        //Ana é uma administradora ela usa métodos de Administradora
        ana.deletarConta("conta_teste@gmail.com");

        System.out.println("\n Sucesso: O conceito de herança evita a repetição de código!");
    }
}
