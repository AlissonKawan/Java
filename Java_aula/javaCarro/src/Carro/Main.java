package Carro;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro(18);


        c1.acelerar(80);
        System.out.println("carro ta a : " +  c1.getVelocidade() +  "km por hora.");
    }
}