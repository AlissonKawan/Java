package SmartAssist;

import java.util.ArrayList;
import java.util.List;

public class Intencao {
    private String nome;
    private List<String> exemplos;

    public Intencao(String nome) {
        this.nome = nome;
        this.exemplos = new ArrayList<>();
    }

    public Intencao(String nome, List<String> exemplos) {
        this.nome = nome;
        this.exemplos = new ArrayList<>(exemplos);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getExemplos() {
        return new ArrayList<>(exemplos);
    }

    public void setExemplos(List<String> exemplos) {
        this.exemplos = new ArrayList<>(exemplos);
    }

    // Métodos funcionais
    public void adicionarExemplo(String exemplo) {
        if (exemplo != null && !exemplo.isBlank()) {
            exemplos.add(exemplo.toLowerCase());
        }
    }

    public boolean combina(String entrada) {
        if (entrada == null) return false;
        String texto = entrada.toLowerCase();

        if (texto.contains(nome.toLowerCase())) return true;

        for (String ex : exemplos) {
            if (texto.contains(ex)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Intencao{ nome='" + nome + "', exemplos=" + exemplos + " }";
    }
}
