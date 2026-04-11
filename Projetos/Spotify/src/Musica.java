public class Musica {
    private String nomeMusica;
    private String cantorOuBanda;

    public Musica(String nomeMusica, String cantorOuBanda) {
        this.nomeMusica = nomeMusica;
        this.cantorOuBanda = cantorOuBanda;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getCantorOuBanda() {
        return cantorOuBanda;
    }

    public void setCantorOuBanda(String cantorOuBanda) {
        this.cantorOuBanda = cantorOuBanda;
    }

}
