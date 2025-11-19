package SmartAssist;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServicoBot {
    private String nomeBot;
    private List<Intencao> intencoes;
    private List<Entidade> entidades;
    private List<NoDialogo> nos;
    private List<String> historico;

    public ServicoBot(String nomeBot) {
        this.nomeBot = nomeBot;
        this.intencoes = new ArrayList<>();
        this.entidades = new ArrayList<>();
        this.nos = new ArrayList<>();
        this.historico = new ArrayList<>();
    }

    public String getNomeBot() {
        return nomeBot;
    }

    public void registrarIntencao(Intencao i) {
        if (i != null) intencoes.add(i);
    }

    public void registrarEntidade(Entidade e) {
        if (e != null) entidades.add(e);
    }

    public void registrarNo(NoDialogo n) {
        if (n != null) nos.add(n);
    }

    // normaliza: minusculas e remove acentos para comparações melhores
    private String normalizar(String s) {
        if (s == null) return "";
        String n = Normalizer.normalize(s, Normalizer.Form.NFD);
        n = n.replaceAll("\\p{M}", "");
        return n.toLowerCase().trim();
    }

    // PROCESSA A ENTRADA: prioridade ENTIDADE -> INTENÇÃO -> NÓS POR CONDIÇÃO -> FALLBACK
    public String processarEntrada(String entradaOriginal) {
        String entrada = normalizar(entradaOriginal);
        historico.add("USUARIO: " + entradaOriginal);

        // 1) detectar ENTIDADE (exata ou por sinonimos)
        Entidade encontrada = null;
        for (Entidade e : entidades) {
            if (e.combina(entrada)) { // Entidade.combina deve usar normalizar internamente também
                encontrada = e;
                break;
            }
        }
        if (encontrada != null) {
            // procurar nó cujo gatilho/condicao textual seja exatamente o nome da entidade
            NoDialogo noPorEntidade = procurarNoPorCondicao(encontrada.getNome());
            if (noPorEntidade != null) {
                String resposta = noPorEntidade.getResposta();
                historico.add(nomeBot + ": " + resposta);
                return resposta;
            }
        }

        // 2) detectar INTENÇÃO
        Optional<Intencao> maybe = encontrarIntencao(entrada);
        if (maybe.isPresent()) {
            Intencao intencao = maybe.get();
            // procurar nó vinculado à intenção (NoPadrao com Intencao vinculada)
            NoDialogo noInt = procurarNoPorIntencao(intencao);
            if (noInt != null) {
                String resposta = noInt.getResposta();
                historico.add(nomeBot + ": " + resposta);
                return resposta;
            }
        }

        // 3) procurar nós por condição textual (palavra-chave direta)
        NoDialogo noCond = procurarNoPorCondicaoNaEntrada(entrada);
        if (noCond != null) {
            String resposta = noCond.getResposta();
            historico.add(nomeBot + ": " + resposta);
            return resposta;
        }

        // 4) fallback
        String resposta = "Desculpe, não entendi. Tente novamente, ou diga 'ajuda'.";
        historico.add(nomeBot + ": " + resposta);
        return resposta;
    }

    // encontra intencao via combina
    public Optional<Intencao> encontrarIntencao(String entrada) {
        for (Intencao i : intencoes) {
            if (i.combina(entrada)) return Optional.of(i);
        }
        return Optional.empty();
    }

    // procura No cujo getCondicao() == chave (comparação normalizada)
    private NoDialogo procurarNoPorCondicao(String chave) {
        String k = normalizar(chave);
        for (NoDialogo n : nos) {
            String cond = n.getCondicao();
            if (cond != null && normalizar(cond).equals(k)) return n;
        }
        return null;
    }

    // procura nó que tem condicao presente na entrada (subtítulos)
    private NoDialogo procurarNoPorCondicaoNaEntrada(String entrada) {
        for (NoDialogo n : nos) {
            String cond = n.getCondicao();
            if (cond != null && entrada.contains(normalizar(cond))) return n;
        }
        return null;
    }

    // procura no vinculado a intencao (NoPadrao que tem Intencao vinculada)
    private NoDialogo procurarNoPorIntencao(Intencao intencao) {
        for (NoDialogo n : nos) {
            if (n instanceof NoPadrao) {
                NoPadrao np = (NoPadrao) n;
                Intencao vinc = np.getIntencaoVinculada();
                if (vinc != null && vinc.getNome().equalsIgnoreCase(intencao.getNome())) return np;
            }
        }
        return null;
    }

    public List<String> getHistorico() {
        return new ArrayList<>(historico);
    }
}
