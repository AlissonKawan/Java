import java.util.ArrayList;

public class Comanda {
    public ArrayList<ItemComanda> listaDeComandas = new ArrayList<>();

    public Comanda(ArrayList<ItemComanda> listaDeComandas) {
        this.listaDeComandas = new ArrayList<>();
    }

    public Comanda() {
    }

    //função que registra item na lista de comandas
    public void registrarItem(ItemComanda item){
        listaDeComandas.add(item);
        System.out.println( item.produto.getDescricao() + item.getQuantidade());
    }

    //função que calcula valor total
    public float calcularValorTotal() {
        float total = 0;
        for (ItemComanda item : listaDeComandas) {
            total += item.calcularPreco(); // Soma o subtotal de cada item
        }
        return total;
    }

    public void imprimirComanda() {
        System.out.println("\n=== RESUMO DA COMANDA ===");
        for (ItemComanda item : listaDeComandas) {
            System.out.println(item.getProduto().getDescricao() +
                    " - Qtd: " + item.getQuantidade() +
                    " - Subtotal: R$ " + item.calcularPreco());
        }
        System.out.println("TOTAL A PAGAR: R$ " + calcularValorTotal());
        System.out.println("========================\n");
    }

    public ArrayList<ItemComanda> getListaDeComandas() {
        return listaDeComandas;
    }

    public void setListaDeComandas(ArrayList<ItemComanda> listaDeComandas) {
        this.listaDeComandas = listaDeComandas;
    }
}

