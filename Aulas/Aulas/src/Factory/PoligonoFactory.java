package Factory;

public class PoligonoFactory {
    public static Poligono getPoligono(int lados){
        return switch (lados) {
            case 3 -> new Triangulo();
            case 4 -> new Quadrado();
            case 5 -> new Pentagono();
            default -> {
                System.out.println("Não encontrado!");
                yield null;
            }
        };
    }
}
