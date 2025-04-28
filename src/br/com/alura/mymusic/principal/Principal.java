package br.com.alura.mymusic.principal;

import br.com.alura.mymusic.modelos.MinhasPreferidas;
import br.com.alura.mymusic.modelos.Musica;
import br.com.alura.mymusic.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("A bar Song");
        minhaMusica.setCantor("Shaboozey");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("DEVastador");
        meuPodcast.setHost("Alec Ikawa");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
