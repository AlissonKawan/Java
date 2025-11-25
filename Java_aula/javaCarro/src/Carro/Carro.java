package Carro;

public class Carro {
    private double velocidade;
    private boolean ligado;
    private int gasolina;


    public Carro(int gasolina){
        this.velocidade = 0;
        this.ligado = false;
        this.gasolina = gasolina;
    }

    public void acelerar (int incremento){
        this.velocidade += incremento;
        System.out.println("O carro acelerou. Velocidade atual: " + velocidade);
    }

    public double getVelocidade() {
        return velocidade;
    }
}
