package SmartAssist;

public abstract class NoDialogo {
    private String id;
    private String condicao;
    private String resposta;

    public NoDialogo(String id, String condicao, String resposta) {
        this.id = id;
        this.condicao = condicao;
        this.resposta = resposta;
    }

    public String getId() {
        return id;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    // Método obrigatório
    public abstract boolean aplica(String entrada, Intencao intencao);
}
