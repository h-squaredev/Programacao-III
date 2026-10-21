package esporte.modelo;

import esporte.enums.NivelAtleta;
import esporte.interfaces.Nadador;

public class NadadorProfissional extends Atleta implements Nadador {

    public NadadorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println("Modalidades: natação");
    }
}
