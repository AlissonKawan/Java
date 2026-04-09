package TreinandoArrays;

public class Garagem {
    private Carro [] carros;
    private int i = 0;

   public Garagem(int qtd){
       carros = new Carro[qtd];
   }
   public String inserirCarro(Carro carro){
       if (carro != null && i < carros.length){
           carros[i] = carro;
           i++;
           return "Carro foi inserido com sucesso!";
       }else {
           return "Coloque o carro!";
       }
   }

}