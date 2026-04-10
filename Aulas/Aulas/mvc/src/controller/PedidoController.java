package controller;

import model.Pedido;
import view.PedidoView;

public class PedidoController {

    private PedidoView view;

    public PedidoController(PedidoView view) {
        this.view = view;
    }
    public void executar(){
        String cliente = view.lercliente();
        double valor = view.lerValor();

        Pedido pedido = new Pedido(cliente, valor);

        view.mostrarResumo(pedido.resumo());
    }
}
