package Heranca;

//cliente vai ser uma subclasse de Usuario ela vai herdar tudo que usuario tem
public class Cliente extends Usuario {
    private int totalDePedidos;
    //precisamos criar um construtor para uma classe herdada
    public Cliente (String nome, String email, String senha, boolean ativo, int totalDePedidos){
        //o super chama o construtor da classe mãe!
        super(nome, email, senha, ativo);
        //esse super serve para quando você coloca o nome de cliente você automaticamente coloca nome da classe usuario tambem e assim por diante
        this.totalDePedidos = totalDePedidos;
    }
    //método para fazer pedido

    public void fazerPedido(){
        //essa linha de baixo pega o total de pedidos que já tem e adiciona mais 1!
        this.totalDePedidos++;
        //pegando o nome do cliente na superclasse
        System.out.println(super.getNome() + "Realizou um novo pedido! Total: " + this.totalDePedidos);
    }

    //sobrescrita, vou pegar um metodo da classe mae e reutilizar ele na classe filho

    public void visualizarPerfil() {
        System.out.println("\nCliente: Visualizando perfil de " + super.getNome() + ". Total de pedidos: " + this.totalDePedidos);
    }

}
