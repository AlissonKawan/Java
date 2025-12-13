package SmartAssist;

import java.util.ArrayList;
import java.util.List;

public class Entidade {
    private String nome;
    private List<String> sinonimos;

    public Entidade(String nome) {
        this.nome = nome;
        this.sinonimos = new ArrayList<>();
    }

    public Entidade(String nome, List<String> sinonimos) {
        this.nome = nome;
        this.sinonimos = new ArrayList<>(sinonimos);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getSinonimos() {
        return new ArrayList<>(sinonimos);
    }

    public void setSinonimos(List<String> sinonimos) {
        this.sinonimos = new ArrayList<>(sinonimos);
    }

    // Métodos funcionais
    public void adicionarSinonimo(String s) {
        if (s != null && !s.isBlank()) {
            sinonimos.add(s.toLowerCase());
        }
    }

    public boolean combina(String entrada) {
        if (entrada == null) return false;
        String t = entrada.toLowerCase();

        if (t.contains(nome.toLowerCase())) return true;

        for (String s : sinonimos) {
            if (t.contains(s)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Entidade{ nome='" + nome + "', sinonimos=" + sinonimos + " }";
    }
}