public class Main {

    public static void main(String[] args) {

        //estou declarando os objetos
        Pessoa c1 = new Pessoa();
        Pessoa c2 = new Pessoa();
        Pessoa c3 = new Pessoa();
        Pessoa c4 = new Pessoa();

        //primeiro coloco os valores que quero no set
        c1.setNome("Ana carol");
        c2.setNomeDoPai("Carlos vidal jose espinosa");
        c3.setaltura(168);
        c4.setIdade(59);

        //agora so mostro com o print e a função/método get
        System.out.println("informações do Alisson: ");

        System.out.println("\n");

        System.out.println("Seu nome é: " + c1.getNome());
        System.out.println("O nome do seu pai é: " + c2.getNomeDoPai());
        System.out.println("altura do seu pai é: " + c3.getAltura());
        System.out.println("idade do seu pai é : " + c4.getIdade());


        //agora a classe casa

        System.out.println("\n----------------------------------\n");

        //declarando objetos
        Casa h1 = new Casa();
        Casa h2 = new Casa();
        Casa h3 = new Casa();
        Casa h4 = new Casa();

        //colocando as sets

        h1.setSala(false);
        h2.setCozinha(true);
        h3.setLavanderia(true);
        h4.setQuarto(true);

        //agora colocando os gets com os prints
        System.out.println("Casa do Alisson: ");

        System.out.println("\n");

        System.out.println("Essa casa tem sala? " + h1.getSala());
        System.out.println("Essa casa tem cozinha? " + h2.getCozinha());
        System.out.println("Essa casa tem lavanderia? " + h3.getLavanderia());
        System.out.println("Essa casa tem quarto? " + h4.getQuarto());


    }

}