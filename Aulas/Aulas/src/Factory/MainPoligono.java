package Factory;

public class MainPoligono {
    public static void main(String[] args) {
        System.out.println( PoligonoFactory.getPoligono(3));
        System.out.println( PoligonoFactory.getPoligono(4));
    }
}
