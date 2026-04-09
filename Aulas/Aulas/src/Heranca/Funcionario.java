package Heranca;

public class Funcionario extends Usuario{
    private String matricula;
    private String setor;


    public Funcionario(String nome, String email, String senha, boolean ativo, String matricula, String setor) {
        super(nome, email, senha, ativo);
        this.matricula = matricula;
        this.setor = setor;
    }

    //método especifico que registra ponto do Funcionario
    public void registrarPonto(){
        System.out.println(super.getNome() + " (Matricula: " + matricula + ") registrou o ponto!");
    }
    @Override
    public void visualizarPerfil() {
        System.out.println("\nFuncionario: Visualizando perfil de: " + super.getNome() + " Setor: " + setor + ". Matricula: " + matricula);
    }
}
