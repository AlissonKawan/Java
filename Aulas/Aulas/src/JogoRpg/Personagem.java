package JogoRpg;

public class Personagem {
    protected int vida;
    protected int danoBase;

    public Personagem(int vida, int danoBase){
        this.danoBase = danoBase;
        this.vida = vida;
    }
    public boolean estaVivo(){
        return vida > 0;
    }
}
