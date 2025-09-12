package Construtores;

public class testeAluno {

    public static void main(String[] args) {
        //criar um objeto da Classe Aluno
        Aluno a1 = new Aluno();

        a1.setMatricula(1);
        a1.setNome("Alisson");
        a1.setCurso("Ads");
        a1.setStatus(true);
        a1.calcularMedia(6, 7, 8);

        System.out.println("Matricula: " + a1.getMatricula());
        System.out.println("Nome:" + a1.getNome());
        System.out.println("Curso: " + a1.getCurso());
        System.out.println("Status: " + a1.getStatus());
        System.out.println("Média geral: " + a1.getMediaGeral());

        System.out.println("\n----------------------------\n");

        //criar um objeto da classe aluno com o construtor parametrizado
        Aluno a2 = new Aluno(2,"Alisson", "ADS", false);
        System.out.println("Matricula: " + a2.getMatricula());
        System.out.println("Nome:" + a2.getNome());
        System.out.println("Curso: " + a2.getCurso());

        a2.calcularMedia(8,9,10);
        a2.setStatus(true);

        System.out.println("Status: " + a2.getStatus());
        System.out.println("Media geral: " + a2.getMediaGeral());

        Aluno a3 = new Aluno(2, "Marcos");
        System.out.println("Matricula: " + a3.getMatricula());
        System.out.println("Nome: " + a3.getNome());

        Aluno a4 = new Aluno(3,"Eduardo");
        System.out.println("Matricula: " + a4.getMatricula());
        System.out.println("Nome: " + a4.getNome());
    }

}
