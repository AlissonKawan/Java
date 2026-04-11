import java.util.ArrayList;

public class Playlist {
    private String nomePlaylist;
    private ArrayList<Musica> listaMusica;
    private UsuarioSpotify usuario;

    public Playlist(String nomePlaylist, UsuarioSpotify usuario) {
        this.nomePlaylist = nomePlaylist;
        this.usuario = usuario;
        listaMusica = new ArrayList<>();
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public UsuarioSpotify getUsuario() {
        return usuario;
    }

    public void mostrarMusicas(){
        for(Musica musica: listaMusica){
            System.out.println(musica.getNomeMusica());
        }
    }
    public void adicionarMusica(Musica musica){
        listaMusica.add(musica);
        System.out.println("Musica adicionada");
    }

    public void removerMusica(Musica musica){
        listaMusica.remove(musica);
        System.out.println("Musica removida");
    }
}
