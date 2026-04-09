package AulaSingleton;

public class Singleton {

    private static  Singleton instancia;

    /**
     * - Construtor privado é uma regra do Singleton, não é qualquer um que vai poder criar um objeto dessa classe
     */
    private Singleton () {
    }

    //
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
            System.out.println("Objeto Singleton criado");
        } else {
            System.out.println("Já existe um objeto Singleton Criado!");
        }
        return instancia;
    }
}
