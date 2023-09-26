package org.example;

import java.util.ArrayList;
import java.util.List;

class Playlist {
    private List<Musica> musicas = new ArrayList<>();

    public void adicionarMusica(String titulo, String nomeArtista, String nacionalidadeArtista) {
        Artista artista = ArtistaFactory.getArtista(nomeArtista, nacionalidadeArtista);
        Musica musica = new Musica(titulo, artista);
        musicas.add(musica);
    }

    public List<String> obterMusicas() {
        List<String> saida = new ArrayList<>();
        for (Musica musica : this.musicas) {
            saida.add(musica.obterMusica());
        }
        return saida;
    }
}