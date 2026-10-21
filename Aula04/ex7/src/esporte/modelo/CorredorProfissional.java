package esporte.modelo;

import esporte.enums.NivelAtleta;
import esporte.interfaces.Corredor;

public class CorredorProfissional extends Atleta implements Corredor {

    public CorredorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println("Modalidades: corrida");
    }
}
