public class Main {
    public static void main(String[] args) {

        //primeiro de tudo tenho q definir os objetos:

        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        // uso o set para colocar a informação que quero no meu objeto.

        c1.setMarca("Bmw");
        c2.setModelo("x6");
        c3.setAno(2026);

        // não preciso colocar linha de codigo get pq ele meio q ja é salvo na classe
        // só preciso definir o print para mostrar na tela.
        System.out.println(c1.getMarca());

        System.out.println(c2.getModelo());

        System.out.println(c3.getModelo());

        System.out.println("\n----------------------------------------------\n");


        //aqui estou quebrando/pulando a linha com o \n

        p1.setNome("Alisson");
        p2.setNomeDoPai("Jose");
        //aqui estou definindo os valores que quero nos objetos da classe pessoa usando o set

        //agora estou mostrando na tela os valores que guardei na classe/set da pessoa:

        System.out.println(p1.getNome());

        System.out.println(p2.getNomeDoPai());




    }
}
