package JogoRpg;

abstract class Player extends Personagem {
    public Player(int vida, int danoBase){
        super(vida, danoBase);
    }
    public int atacar(){
        return danoBase;
    }
    public abstract int habilidadeEspecial();
}
