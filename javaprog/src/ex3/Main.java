package ex3;

public class Main {
    public static void main(String[] args) {
        contaBancaria c1 = new contaBancaria();
        System.out.println("Seu saldo atual é : R$" + c1.consultarSaldo());
        c1.depositar(10);
        System.out.println("Seu saldo atual é : R$" + c1.consultarSaldo());
        c1.depositar(400);
        System.out.println("Seu saldo atual é : R$" + c1.consultarSaldo());
        c1.sacar(300);
        System.out.println("Seu saldo atual é : R$" + c1.consultarSaldo());

    }
}
