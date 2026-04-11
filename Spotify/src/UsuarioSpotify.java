import java.util.ArrayList;

public class UsuarioSpotify {
    private String nomeUsuario;
    private ArrayList<Playlist> listaDePlaylist;

    public UsuarioSpotify(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        listaDePlaylist = new ArrayList<>();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public Playlist criarPlaylist(String nomePlaylist){
        Playlist playlist = new Playlist(nomePlaylist, this);
        listaDePlaylist.add(playlist);
        System.out.println("Playlist adicionada");
        return playlist;
    }

    public void removerPlaylist(Playlist playlist){
        listaDePlaylist.remove(playlist);
        System.out.println("Lista removida");
    }
}
