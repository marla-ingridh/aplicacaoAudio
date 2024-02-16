package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.modelos.Audio;

public class Musica extends Audio {
    private String album;
    private String genero;
    private String cantor;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @java.lang.Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 2000){
            return 10;
        }else{
            return 8;
        }
    }
}
