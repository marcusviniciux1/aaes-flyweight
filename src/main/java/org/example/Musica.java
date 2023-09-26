package org.example;

public class Musica {
    private String titulo;
    private Artista artista;

    public Musica(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String obterMusica() {
        return "Música{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista.getNome() + '\'' +
                ", nacionalidade='" + artista.getNacionalidade() + '\'' +
                '}';
    }
}