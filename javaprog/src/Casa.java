public class Casa {

    private boolean sala;
    private boolean cozinha;
    private boolean quarto;
    private boolean lavanderia;

    public boolean getSala(){
        return sala;
    }
    public boolean getCozinha(){
        return cozinha;
    }
    public boolean getQuarto(){
        return quarto;
    }
    public boolean getLavanderia(){
        return lavanderia;
    }

    public void setCozinha(boolean cozinha) {
        this.cozinha = cozinha;
    }

    public void setSala(boolean sala) {
        this.sala = sala;
    }

    public void setLavanderia(boolean lavanderia) {
        this.lavanderia = lavanderia;
    }
    public void setQuarto(boolean quarto){
        this.quarto = quarto;
    }
}
