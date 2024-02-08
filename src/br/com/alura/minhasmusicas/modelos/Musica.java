package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.modelos.Audio;

public class Musica extends Audio {
    private String cantor;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
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
