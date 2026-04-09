package AulaSingleton;

public class Singleton2 {

    //Segunda forma de criar um singleton, criar ele logo de cara
    private static Singleton2 instancia = new Singleton2();

    //(1)
    private Singleton2() {
        System.out.println("objeto Singleton CRIADO!");
    }

    public static Singleton2 getInstancia() {
        return instancia;
    }
}
