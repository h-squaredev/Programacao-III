package esporte.modelo;

import esporte.enums.NivelAtleta;
import esporte.interfaces.Ciclista;
import esporte.interfaces.Corredor;
import esporte.interfaces.Nadador;

public class Triatleta extends Atleta implements Corredor, Nadador, Ciclista {

    public Triatleta(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando.");
    }

    @Override
    public void pedalar() {
        System.out.println(nome + " está pedalando.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println("Modalidades: corrida, natação e ciclismo");
    }
}
