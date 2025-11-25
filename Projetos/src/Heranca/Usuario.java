package Heranca;
//Herança é como uma "família" de classes. Uma classe filha (subclasse) herda métodos e variáveis de uma classe pai (superclasse).

//Herança = reutilizar código. A classe filha herda o que o pai tem e pode adicionar coisas novas.

//classes maes são as super classes enquanto as classes herdadas delas são as subclasses
public class Usuario {
    //definindo métodos
   private String nome;
   private String email;
   private String senha;
   private boolean ativo;

    public Usuario(String nome, String email, String senha, boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }

    //métodos getters e setters
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    //Métodos comuns e Públicos

    //método para fingir que esta fazendo um login somente com print
    public void login() {
        System.out.println(nome + "(" + email +") efetuou o login no sistema!" );
    }
    //metodo para fingir que esta visualizando o perfil somente com captura utilizando print
    public void visualizarPerfil(){
        System.out.println("Visualizando o perfil de: " + nome);
    }
}
