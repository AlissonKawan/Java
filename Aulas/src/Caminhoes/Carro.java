package Caminhoes;

public class Carro extends Veiculos {

    public Carro(String id) {
        super(id);
    }

    @Override
    public void abastecer() {
        System.out.println("Carro " + getId() + " está abastecendo no posto!");
    }
}
