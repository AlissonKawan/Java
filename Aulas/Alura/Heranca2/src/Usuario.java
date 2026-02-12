import java.util.Scanner;

class Usuario {
    String nome;
    String email;
    String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do usuário: ");
        nome = sc.nextLine();
        System.out.print("Digite o e-mail do usuário: ");
        email = sc.nextLine();
        System.out.print("Digite a senha: ");
        senha = sc.nextLine();
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
    }
}