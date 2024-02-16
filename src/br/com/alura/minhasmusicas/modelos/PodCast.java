package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.modelos.Audio;

public class PodCast extends Audio {
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @java.lang.Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500 ){
            return 10;
        }else {
            return 7;
        }
    }
}
