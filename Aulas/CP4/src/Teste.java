import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Coca", 10);
        Produto p2 = new Produto(2, "leite",5 );
        ItemComanda item = new ItemComanda(p1, 2);
        Comanda comanda = new Comanda(new ArrayList<>());
        CatalogoProdutos catalogoProdutos = new CatalogoProdutos(new ArrayList<>());
        item.calcularPreco();
        catalogoProdutos.buscarProduto();
        comanda.calcularValorTotal();
    }
}
