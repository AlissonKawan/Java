class Administrador extends Usuario {

    public Administrador(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    // Método específico do Administrador
    void deletarUsuario(Usuario usuario) {
        if (usuario != null) {
            System.out.println("Usuário " + usuario.nome + " deletado com sucesso!");
        } else {
            System.out.println("Nenhum usuário para deletar.");
        }
    }
}