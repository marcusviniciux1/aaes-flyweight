package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {

    @Test
    void deveRetornarMusicas() {
        Playlist playlist = new Playlist();
        playlist.adicionarMusica("Musica 1", "Artista 1", "Brasileiro");
        playlist.adicionarMusica("Musica 2", "Artista 1", "Brasileiro");
        playlist.adicionarMusica("Musica 3", "Artista 1", "Brasileiro");
        playlist.adicionarMusica("Musica 4", "Artista 2", "Brasileiro");

        List<String> saida = Arrays.asList(
                "Música{titulo='Musica 1', artista='Artista 1', nacionalidade='Brasileiro'}",
                "Música{titulo='Musica 2', artista='Artista 1', nacionalidade='Brasileiro'}",
                "Música{titulo='Musica 3', artista='Artista 1', nacionalidade='Brasileiro'}",
                "Música{titulo='Musica 4', artista='Artista 2', nacionalidade='Brasileiro'}");

        assertEquals(saida, playlist.obterMusicas());
    }

    @Test
    void deveRetornarTotalArtistas() {
        Playlist playlist = new Playlist();
        playlist.adicionarMusica("Musica 1", "Artista 1", "Brasileiro");
        playlist.adicionarMusica("Musica 2", "Artista 1", "Brasileiro");
        playlist.adicionarMusica("Musica 3", "Artista 1", "Brasileiro");
        playlist.adicionarMusica("Musica 4", "Artista 2", "Brasileiro");

        assertEquals(2, ArtistaFactory.getTotalArtistas());
    }

}