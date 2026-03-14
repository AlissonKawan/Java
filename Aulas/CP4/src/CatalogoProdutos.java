
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoProdutos {
    public ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public CatalogoProdutos(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    //função que cadastra o produto na lista de produtos
    public void cadastroDeProduto(){
        for (Produto produto : listaDeProdutos){
            boolean add = listaDeProdutos.add(produto);
            System.out.println("Produto cadastrado");
        }
    }
    Scanner sc = new Scanner(System.in);
    //função que busca o produto na lista
    public void buscarProduto(){
        System.out.println("Qual produto deseja buscar? digite o nome");
        String busca = sc.next();
        for (Produto produtos : listaDeProdutos){
            if (busca.equals(produtos.getDescricao())){
                System.out.println("Produto encontrado!");
                System.out.println(produtos.getDescricao());
            } else{
                System.out.println("Produto não encontrado");
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "CatalogoProdutos{" +
                "listaDeProdutos=" + listaDeProdutos +
                ", sc=" + sc +
                '}';
    }
}
