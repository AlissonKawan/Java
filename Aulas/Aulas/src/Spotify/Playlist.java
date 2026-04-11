package Spotify;

import java.util.ArrayList;

public class Playlist {
    private  ArrayList<String> listaMusica;
    private static Playlist instancia;

    private Playlist(){
        listaMusica = new ArrayList<>();
    }

    public static Playlist getInstance() {
        if (instancia == null){
            instancia = new Playlist();
            System.out.println("Lista criada");
        }
        return instancia;
    }

    public void adicionarMusica(String musica){
        listaMusica.add(musica);
    }

    public void listarMusicas(){
        for (String musicas : listaMusica){
            System.out.println(musicas);
        }
    }
}
