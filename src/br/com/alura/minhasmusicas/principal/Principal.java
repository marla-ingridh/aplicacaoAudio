package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {

        PodCast podcast1 = new PodCast();
        podcast1.setTitulo("Java Orientado a Objetos");
        podcast1.setAutor("Marla Ingridh");
       // podcast1.setDuracao(25);

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            podcast1.curte();
        }


        //Instanciando classe música
        Musica musica1 = new Musica();
        musica1.setCantor("Maria Maçal");
        musica1.setTitulo("Deixa");

        //Gera 1000 reproduções para classificar
        for (int i = 0; i < 1000 ; i++) {
            musica1.reproduz();
        }
        //gera 50 curtidas para a música
        for (int i = 0; i < 50; i++) {
            musica1.curte();
        }

        //Classe que trabalha polimorfismo e classifica os audios
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast1);
        preferidas.inclui(musica1);

    }
}