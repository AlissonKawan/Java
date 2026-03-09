package ex2;

public class Retangulo {

    private double largura;
    private double altura;

    //construtor com parametros
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    //construtor vazio
    public Retangulo() {
    }
    //metodos
    public void calcularArea(){
        double area = largura * altura;
        System.out.println(area + "m²");
    }
    public void calcularPerimetro(){
        double perimetro = 2*(largura + altura);
        System.out.println("O valor do perimetro é: " + perimetro);
    }
}
