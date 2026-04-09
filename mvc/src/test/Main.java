package test;

import controller.PedidoController;
import view.PedidoView;

public class Main {
    public static void main(String[] args) {
        //criando um Objeto pedido view
        PedidoView view = new PedidoView();
        PedidoController controller = new PedidoController(view);
        controller.executar();
    }
}
