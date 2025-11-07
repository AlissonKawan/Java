package ProjetoIngressos;

public class Plataforma {
    private Cliente cliente;
    private boolean ingressoDisponivel;
    private String setor;

    public Plataforma(Cliente cliente, boolean ingressoDisponivel, String setor) {
        this.cliente = cliente;
        this.ingressoDisponivel = ingressoDisponivel;
        this.setor = setor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isIngressoDisponivel() {
        return ingressoDisponivel;
    }

    public void setIngressoDisponivel(boolean ingressoDisponivel) {
        this.ingressoDisponivel = ingressoDisponivel;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
