package Caminhoes;

public abstract class Veiculos {

    private String id;

    public Veiculos (String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public void mover(){
        System.out.println(id + " Esta se movendo");
    }

    public abstract void abastecer();
}
