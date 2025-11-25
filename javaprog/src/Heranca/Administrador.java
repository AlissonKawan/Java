package Heranca;

public class Administrador extends Usuario{

    private String nivelAcesso;

    //fazendo a mesma coisa que fiz na classe cliente utilizando o construtor da classe mae na classe filha
    public Administrador(String nome, String email, String senha, boolean ativo, String nivelAcesso) {
        super(nome, email, senha, ativo);
        this.nivelAcesso = nivelAcesso;
    }

    //método especifico
    //criando método para deletar conta
    public void deletarConta(String emailUsuario){
        System.out.println("\nADMIN (" + this.nivelAcesso + "): Conta do usuário " + emailUsuario + " Deletada");
    }
}
