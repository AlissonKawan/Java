package TreinandoArrays;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Gol", "Tcross", 2020);
        Carro c2 = new Carro("Fiat", "Uno", 2010);
        c1.setModelo("Gol");
        System.out.println("Modelo agora: " + c1.getModelo());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
