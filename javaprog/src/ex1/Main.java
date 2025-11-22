package ex1;

public class Main {
    public static void main(String[] args) {

        Estudante p1 = new Estudante("Pedro",18,1.80);

        p1.apresentar();
        p1.envelhecer(5);
        p1.apresentar();

    }
}
