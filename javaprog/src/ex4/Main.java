package ex4;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Gol" , "TCross", 2022);

        c1.exibirInformacoes();
        c1.acelerar(50);
        c1.exibirInformacoes();
        c1.frear(20);
        c1.exibirInformacoes();
        c1.frear(10);
        c1.exibirInformacoes();
    }
}
