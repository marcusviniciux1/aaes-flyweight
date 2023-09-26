package org.example;

import java.util.HashMap;
import java.util.Map;

class ArtistaFactory {
    private static Map<String, Artista> artistas = new HashMap<>();

    public static Artista getArtista(String nome, String nacionalidade) {
        Artista artista = artistas.get(nome);
        if (artista == null) {
            artista = new Artista(nome, nacionalidade);
            artistas.put(nome, artista);
        }
        return artista;
    }

    public static int getTotalArtistas() {
        return artistas.size();
    }
}