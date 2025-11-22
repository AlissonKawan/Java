package ex4;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private  double velocidade;

    //construtores
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.velocidade = 0;
    }
    public Carro(){}

    //metodos

    public void acelerar (double acelera){
        if (acelera> 0) {
            velocidade += acelera;
            System.out.println("Voce acelerou: " + acelera);
        }
        else{
            System.out.println("Coloque uma aceleração positiva");
        }
    }
    public void frear (double freia){
        if (velocidade <freia) {
            System.out.println("Vc esta freiando mais q o permitido");
        } else if (velocidade > 0) {
            velocidade -= freia;
        } else {
            System.out.println("O carro esta parado");
        }
    }
    public void exibirInformacoes(){
        System.out.println("Marca do carro: " + marca + " Modelo: " + modelo + " Ano: " + ano + " Velocidade atual: " + velocidade + "Km/h");
    }
}
