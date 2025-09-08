public class Pessoa {

    //atributos, estou fazendo os atributos para dps colocar os metodos nele para aplica-los
    private String nome;
    private int idade;
    private int altura;
    private String nomeDoPai;

    //metodos

    public String getNome(){
        return nome;
    }
    public  String getNomeDoPai(){
        return nomeDoPai;
    }
    public int getIdade(){
        return idade;
        //o get serve para mostrar o que o set coloca
        //o return é a mensagem que o get tem que mostrar q sera colocada nesse caso no idade
    }
    public int getAltura(){
        return altura;
    }
    //agora os sets, servem para guardar a informação que eu coloco
    public void setNome(String nome){
        //void é pq ele n retorna nada ele so faz a função dele
        //O string nome em parenteses meio que mostra onde meu codigo vai entrar e precisa definir o tipo dele
        this.nome = nome;
        //this é para diferenciar o atributo da classe para o parametro do metodo
    }
    public void setNomeDoPai(String nomeDoPai){
        this.nomeDoPai = nomeDoPai;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setaltura(int altura){
        this.altura = altura;
    }

}
