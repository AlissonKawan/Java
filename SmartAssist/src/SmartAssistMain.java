

import java.util.Arrays;
import java.util.Scanner;

public class SmartAssistMain {
    public static void main(String[] args) {

        ServicoBot bot = new ServicoBot("Smart Assist");


        // INTENÇÕES (Apenas temas gerais)
        Intencao saudacao = new Intencao("saudacao",
                Arrays.asList("oi", "olá", "ola", "bom dia"));

        Intencao academico = new Intencao("academico",
                Arrays.asList("estudo", "faculdade", "matéria", "materia", "tcc"));

        Intencao profissional = new Intencao("profissional",
                Arrays.asList("trabalho", "emprego", "carreira"));

        Intencao javaInt = new Intencao("java",
                Arrays.asList("java", "jdk", "jvm", "backend", "poo"));

        Intencao codeReview = new Intencao("code review",
                Arrays.asList("code review", "revisão de código", "clean code"));

        Intencao encerrar = new Intencao("encerrar",
                Arrays.asList("tchau", "sair", "encerrar"));


        bot.registrarIntencao(saudacao);
        bot.registrarIntencao(academico);
        bot.registrarIntencao(profissional);
        bot.registrarIntencao(javaInt);
        bot.registrarIntencao(codeReview);
        bot.registrarIntencao(encerrar);



        // ENTIDADES (Específicas)
        bot.registrarEntidade(new Entidade("curriculo",
                Arrays.asList("curriculo", "currículo", "cv")));

        bot.registrarEntidade(new Entidade("linkedin",
                Arrays.asList("linkedin", "linked", "linkein")));

        bot.registrarEntidade(new Entidade("vagas",
                Arrays.asList("vaga", "vagas", "estágio")));

        bot.registrarEntidade(new Entidade("git",
                Arrays.asList("github", "gitlab", "commit", "branch")));

        bot.registrarEntidade(new Entidade("java",
                Arrays.asList("java", "jdk", "jvm")));

        bot.registrarEntidade(new Entidade("backend",
                Arrays.asList("backend", "api", "spring", "rest")));

        bot.registrarEntidade(new Entidade("poo",
                Arrays.asList("poo", "orientação a objetos", "classe", "objeto")));

        bot.registrarEntidade(new Entidade("tcc",
                Arrays.asList("tcc", "monografia", "artigo")));

        bot.registrarEntidade(new Entidade("materia",
                Arrays.asList("matéria", "materia", "disciplina")));

        bot.registrarEntidade(new Entidade("estudo",
                Arrays.asList("estudo", "estudar", "revisar")));

        bot.registrarEntidade(new Entidade("clean code",
                Arrays.asList("clean code", "código limpo", "boas práticas")));



        // RESPOSTAS PARA INTENÇÕES
        bot.registrarNo(new NoPadrao("n1", saudacao,
                "Olá! Eu sou o Smart Assist 🤖. Como posso ajudar?"));

        bot.registrarNo(new NoPadrao("n2", academico,
                "Você quer ajuda com assuntos acadêmicos! Posso ajudar com estudo, matérias e TCC."));

        bot.registrarNo(new NoPadrao("n3", profissional,
                "Você quer ajuda profissional! Posso ajudar com currículo, LinkedIn, vagas e Git."));

        bot.registrarNo(new NoPadrao("n4", javaInt,
                "Vejo que você quer aprender Java! Quer saber sobre POO, sintaxe, backend ou JVM?"));

        bot.registrarNo(new NoPadrao("n5", codeReview,
                "Você quer ajuda com Code Review! Posso explicar Clean Code, padrões, clareza e boas práticas."));

        bot.registrarNo(new NoPadrao("n6", encerrar,
                "Até mais! 👋"));



        // RESPOSTAS PARA ENTIDADES (gatilho textual)
        bot.registrarNo(new NoPadrao("e1", "curriculo",
                "Um bom currículo deve ter resumo profissional, habilidades, projetos, GitHub e LinkedIn."));

        bot.registrarNo(new NoPadrao("e2", "linkedin",
                "Para melhorar seu LinkedIn: foto profissional, bom título, 'Sobre' bem escrito e projetos."));

        bot.registrarNo(new NoPadrao("e3", "vagas",
                "Para encontrar vagas use LinkedIn, Gupy, Indeed. Procure estágio ou júnior no começo."));

        bot.registrarNo(new NoPadrao("e4", "git",
                "Git básico:\n- commit\n- branch\n- merge\n- pull request\n- push/pull"));

        bot.registrarNo(new NoPadrao("e5", "java",
                "Java é muito usado em empresas. Comece por variáveis, loops, arrays e POO."));

        bot.registrarNo(new NoPadrao("e6", "backend",
                "Para backend em Java: Spring Boot, APIs REST, MySQL e deploy."));

        bot.registrarNo(new NoPadrao("e7", "poo",
                "Pilares da POO: encapsulamento, herança, polimorfismo e abstração."));

        bot.registrarNo(new NoPadrao("e8", "tcc",
                "TCC bom tem: tema relevante, objetivos claros, metodologia e conclusão estruturada."));

        bot.registrarNo(new NoPadrao("e9", "materia",
                "Posso ajudar com matérias como lógica, algoritmos, Java e banco de dados."));

        bot.registrarNo(new NoPadrao("e10", "estudo",
                "Métodos de estudo: Pomodoro, resumos, exercícios e revisão espaçada."));

        bot.registrarNo(new NoPadrao("e11", "clean code",
                "Clean Code recomenda: nomes claros, métodos pequenos, simplicidade e testes."));



        // ---------- RESPOSTAS DETALHADAS PARA MATÉRIAS ----------
        bot.registrarNo(new NoPadrao("mat1", "logica",
                "Lógica de programação é a base da computação.\n" +
                        "Você aprende a pensar como um programador, usando:\n" +
                        "- Variáveis\n" +
                        "- Condições (if/else)\n" +
                        "- Repetições (loops)\n" +
                        "- Resolução de problemas\n" +
                        "É o primeiro passo antes de aprender qualquer linguagem."));

        bot.registrarNo(new NoPadrao("mat2", "algoritmos",
                "Algoritmos são sequências de passos para resolver um problema.\n" +
                        "Você estuda:\n" +
                        "- Estruturas de repetição\n" +
                        "- Estruturas de decisão\n" +
                        "- Entrada e saída de dados\n" +
                        "- Fluxogramas\n" +
                        "- Lógica estruturada\n" +
                        "É essencial para aprender a programar bem."));

        bot.registrarNo(new NoPadrao("mat3", "java",
                "Java é muito usado em empresas e backend.\n" +
                        "O que você deve estudar no início:\n" +
                        "- Variáveis e Tipos\n" +
                        "- Condições\n" +
                        "- Loops\n" +
                        "- Arrays e Coleções\n" +
                        "- Classes e Objetos\n" +
                        "Depois evolua para: POO, Streams, APIs REST, Spring Boot."));

        bot.registrarNo(new NoPadrao("mat4", "banco de dados",
                "Banco de dados armazena informações de sistemas.\n" +
                        "Você deve estudar:\n" +
                        "- SQL (SELECT, INSERT, UPDATE, DELETE)\n" +
                        "- Modelagem (tabelas, chaves primárias, relacionamentos)\n" +
                        "- Stored Procedures\n" +
                        "- Normalização\n" +
                        "- Uso de MySQL e PostgreSQL\n" +
                        "Banco de dados é fundamental para qualquer aplicação."));

        // ---------- RESPOSTAS DETALHADAS PARA CODE REVIEW ----------

         // CLEAN CODE
        bot.registrarNo(new NoPadrao("cr1", "clean code",
                "Clean Code é sobre escrever código simples, claro e fácil de manter.\n" +
                        "- Use nomes significativos\n" +
                        "- Evite funções longas\n" +
                        "- Diminua duplicação\n" +
                        "- Escreva cada função com um propósito\n" +
                        "- Prefira simplicidade ao invés de complexidade\n" +
                        "Quer ver exemplos? Posso te mostrar!"));


        // PADRÕES (DESIGN PATTERNS)
        bot.registrarNo(new NoPadrao("cr2", "padrao",
                "Padrões de projeto (Design Patterns) ajudam a resolver problemas comuns em software.\n" +
                        "Os principais são:\n" +
                        "- Singleton (uma única instância)\n" +
                        "- Factory (criação de objetos)\n" +
                        "- Strategy (trocar comportamentos)\n" +
                        "- Observer (eventos/notificações)\n" +
                        "- DTO (transferência de dados)\n" +
                        "Posso explicar qualquer um deles, é só pedir!"));

        bot.registrarNo(new NoPadrao("cr2b", "padrões",
                "Você quer aprender sobre Design Patterns.\n" +
                        "Principais padrões:\n" +
                        "- Singleton\n" +
                        "- Factory\n" +
                        "- Strategy\n" +
                        "- Adapter\n" +
                        "- Observer\n" +
                        "Qual deles você quer entender melhor?"));


        // CLAREZA
        bot.registrarNo(new NoPadrao("cr3", "clareza",
                "Clareza no código significa escrever algo que outro programador entende rapidamente.\n" +
                        "Boas práticas de clareza:\n" +
                        "- Nomes explícitos\n" +
                        "- Funções curtas\n" +
                        "- Código visualmente organizado\n" +
                        "- Comentários apenas quando necessário\n" +
                        "Posso mostrar como deixar código mais claro se quiser!"));


        // BOAS PRÁTICAS
        bot.registrarNo(new NoPadrao("cr4", "boas praticas",
                "Boas práticas de programação incluem:\n" +
                        "- Seguir padrões da linguagem\n" +
                        "- Evitar duplicação de código (DRY)\n" +
                        "- Testes automatizados\n" +
                        "- Usar versionamento/Git corretamente\n" +
                        "- Código legível e organizado\n" +
                        "Se quiser, posso avaliar seu código e sugerir melhorias."));

        bot.registrarNo(new NoPadrao("cr4b", " boas práticas",
                "Você quer saber sobre boas práticas.\n" +
                        "- Métodos pequenos\n" +
                        "- Código simples\n" +
                        "- Evitar comentários desnecessários\n" +
                        "- Nomes claros\n" +
                        "- Testes sempre que possível\n" +
                        "Posso te dar exemplos reais, é só mandar um trecho de código!"));


        // INTERFACE VISUAL
        System.out.println("========================================");
        System.out.println("🤖  SMART ASSIST");
        System.out.println("Seu assistente inteligente");
        System.out.println("========================================");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nFale sobre: acadêmico | profissional | java | code review | currículo | git | vagas | linkedin | encerrar");

        while (true) {

            System.out.print("\nVocê: ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("encerrar") ||
                    entrada.equalsIgnoreCase("sair") ||
                    entrada.equalsIgnoreCase("tchau")) {

                exibir("Até mais! 👋");
                break;
            }

            String resposta = bot.processarEntrada(entrada);
            exibir(resposta);
        }

        sc.close();
    }

    // FORMATAÇÃO BONITA
    private static void exibir(String texto) {
        System.out.println("\n+--------------------------------------+");
        System.out.println("| Smart Assist:");
        formatarTexto(texto);
        System.out.println("+--------------------------------------+\n");
    }

    private static void formatarTexto(String texto) {
        int largura = 36;
        while (!texto.isEmpty()) {
            if (texto.length() <= largura) {
                System.out.printf("| %-36s |\n", texto);
                break;
            }
            int pos = texto.lastIndexOf(" ", largura);
            if (pos == -1) pos = largura;
            System.out.printf("| %-36s |\n", texto.substring(0, pos));
            texto = texto.substring(pos).trim();
        }
    }
}