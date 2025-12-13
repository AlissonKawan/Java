package SmartAssist;

public class NoPadrao extends NoDialogo {
    private Intencao intencaoVinculada;

    public NoPadrao(String id, String condicao, String resposta) {
        super(id, condicao, resposta);
    }

    @Override
    public boolean aplica(String entrada, Intencao intencao) {
        return false;
    }

    public NoPadrao(String id, Intencao intencao, String resposta) {
        super(id, intencao != null ? intencao.getNome() : null, resposta);
        this.intencaoVinculada = intencao;
    }

    public Intencao getIntencaoVinculada() {
        return intencaoVinculada;
    }
}