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
        System.out.println("Seu nome é: " + c1.getNome());
        System.out.println("O nome do seu pai é: " + c2.getNomeDoPai());
        System.out.println("Sua altura é: " + c3.getAltura());
        System.out.println("Sua idade é : " + c4.getIdade());
    }

}