package Caminhoes;

public class SistemaLogistica {
    public static void main(String[] args) {

        Caminhao meuCaminhao = new Caminhao("Optimus-prime");

        System.out.println("--- Início de Operação ---");
        meuCaminhao.abastecer();
        meuCaminhao.mover();

        System.out.println("\n");

        Carro meuCarro = new Carro("Bumblebee");
        meuCarro.abastecer();
        meuCarro.mover();
    }
}
