package Treino_aula;

public class Carro {

    //atributos
    private String marca;
    private int ano;
    private double velocidade;
    private boolean ligado;
    private boolean buzinar;

    //construtor
    //dentro de parenteses temos os parametros
    // parametro = o valor q eu coloco
    public Carro(String marca, int ano, double velocidade, boolean ligado , boolean buzinar){
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
        this.ligado = ligado;
        this.buzinar = buzinar;
    }
    public Carro(){}

    //metodos
    public void exibir(){
        System.out.println(marca);
        System.out.println(velocidade);
        System.out.println(ano);
        System.out.println(ligado);
        System.out.println(buzinar);
    }

    public void acelerar(double acelera){
        if (acelera<0){
            System.out.println("Insira um valor positivo");
        }
        else{
            velocidade += acelera;
            System.out.println("carro acelerou");
        }
    }
}

