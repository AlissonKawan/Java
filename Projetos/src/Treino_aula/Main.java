package Treino_aula;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("Ford", 2022, 0, true, true );
        c1.exibir();
        c1.acelerar(20);
        c1.exibir();
    }
}

