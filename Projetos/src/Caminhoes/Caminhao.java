package Caminhoes;

public class Caminhao extends  Veiculos{

    public Caminhao(String id) {
        super(id);
    }

    @Override
    public void abastecer() {
        System.out.println("Caminhao " + getId() + " está abastecendo no posto!");
    }
}
