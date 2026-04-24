public class Test {

    public static void main(String[] args) {
        UsuarioSpotify Alisson = new UsuarioSpotify("Alisson");
         Playlist playlist = Alisson.criarPlaylist("Rock");
         Musica musica1 = new Musica("Seize the Day", "Avenged Sevenfold");
         playlist.adicionarMusica(musica1);
         playlist.mostrarMusicas();

    }
}
