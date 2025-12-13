package Ex6;

public class ListaAlunos {
    private Aluno[] alunos; //declaração de um array de objetos do tipo Aluno
    private int i = 0; //variavel de controle do indice do array;

    //construtor
    public ListaAlunos(int qtd) {
        System.out.println("----- Lista Criada! -----");
        alunos = new Aluno[qtd];
    }

    //inserir um aluno na lista alunos
    public String inserir(Aluno aluno) {
        if (aluno != null) {
            alunos[i] = aluno;
            i++;
            return "Aluno inserido na lista!";
        }else {
            return "Aluno NÃO inserido";
        }
    }

    //Listar os alunos do array
    public void listar() {
        for(int i=0; i<alunos.length; i++) {
            System.out.println(alunos[i].toString());
        }
    }
}
