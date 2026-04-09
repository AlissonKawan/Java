package AulaSingleton;

public class TesteSingleton {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstancia();
        Singleton s2 = Singleton.getInstancia();

        System.out.println(s1 == s2);
    }
}