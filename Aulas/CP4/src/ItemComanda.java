import java.awt.geom.QuadCurve2D;

public class ItemComanda {
    public Produto produto;
    public int quantidade;

    public ItemComanda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    //função que calcula preço do produto + quantidade
    public float calcularPreco(){
        return produto.getPrecoUnitario() * quantidade;
    }


    @Override
    public String toString() {
        return "ItemComanda{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
