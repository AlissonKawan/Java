package ex5;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Alisson", 18);
        Pessoa p2 = new Pessoa("Jennifer" , 11);

        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());

        System.out.println("\n");

        System.out.println(p2.getNome());
        System.out.println(p2.getIdade());

        System.out.println("\n");
        p1.verificarIdade();
        p2.verificarIdade();


    }
}
