package Spotify;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Playlist p1 = Playlist.getInstance();
        p1.adicionarMusica("Chop suey");
        Playlist p2 = Playlist.getInstance();
        p2.adicionarMusica("Kansas");
        p1.listarMusicas();
    }
}
