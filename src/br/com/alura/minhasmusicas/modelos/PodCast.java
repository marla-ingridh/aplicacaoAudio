package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.modelos.Audio;

public class PodCast extends Audio {
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @java.lang.Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500 ){
            return 10;
        }else {
            return 8;
        }
    }
}
