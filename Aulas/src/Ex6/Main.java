package Ex6;

public class Main {
    public static void main(String[] args) {

        //criando uma lista de Aluno
        ListaAlunos lista = new ListaAlunos(3);

        //criando um aluno
        Aluno a1 = new Aluno(1,"Alisson", "1TDSPS", 8);
        Aluno a2 = new Aluno(2, "Marcos", "1TDSPS", 9);
        Aluno a3 = new Aluno(3, "Eduardo", "1TDSPS", 8);

        //acesso aso atributos sem o toString()
        System.out.println("Matricula: " + a1.getMatricula());
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Turma: " + a1.getTurma());
        System.out.println("Média: " + a1.getMedia());
        a1.setMedia(9);

        System.out.println("===========================");

        System.out.println(a1.toString());

        //inserindo os objetos Aluno na lista
        lista.inserir(a1);
        lista.inserir(a2);
        lista.inserir(a3);

        //imprimindo os elementos da lista
        lista.listar();

    }
}
