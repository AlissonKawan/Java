public class Main {

    public static void main(String[] args) {

        //estou declarando os objetos
        Pessoa c1 = new Pessoa();
        Pessoa c2 = new Pessoa();
        Pessoa c3 = new Pessoa();
        Pessoa c4 = new Pessoa();

        //primeiro coloco os valores que quero no set
        c1.setNome("Alisson");
        c2.setNomeDoPai("Jose");
        c3.setaltura(18);
        c4.setIdade(18);

        //agora so mostro com o print e a função/método get
        System.out.println("informações do Alisson: ");

        System.out.println("\n");

        System.out.println("Seu nome é: " + c1.getNome());
        System.out.println("O nome do seu pai é: " + c2.getNomeDoPai());
        System.out.println("Sua altura é: " + c3.getAltura());
        System.out.println("Sua idade é : " + c4.getIdade());


        //agora a classe casa

        System.out.println("\n----------------------------------\n");

        //declarando objetos
        Casa h1 = new Casa();
        Casa h2 = new Casa();
        Casa h3 = new Casa();
        Casa h4 = new Casa();

        //colocando as sets

        h1.setSala(true);
        h2.setCozinha(true);
        h3.setLavanderia(false);
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