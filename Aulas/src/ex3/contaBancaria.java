package ex3;

public class contaBancaria {

    //atributos
    private String numeroDaConta;
    private String titular;
    private double saldoBancario;

    public contaBancaria(String numeroDaConta, String titular){
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        saldoBancario = 0;
    }
    public contaBancaria(){}

    //metodos
    public void depositar(double adicionar) {
        if (adicionar > 0) {
            saldoBancario += adicionar;
            System.out.println("Voce depositou: R$" + adicionar);
        }
        else{
            System.out.println("Adicione um valor maior que 0");
        }
    }
    public void sacar(double saca){
        if (saca> saldoBancario){
            System.out.println("Saldo indisponivel para sacar seu saldo é: R$" + saldoBancario + " Mas voce quer sacar R$: " + saca);
        }
        else{
            saldoBancario -= saca;
            System.out.println("Voce sacou: R$" + saca);
        }
    }
    public double consultarSaldo(){
        return saldoBancario;
    }
    public void consultarInformacoes(){
        System.out.println("Numero da conta: " + numeroDaConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo bancario: " + saldoBancario);
    }
}
