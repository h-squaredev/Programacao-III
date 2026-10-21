package esporte.app;

import esporte.enums.NivelAtleta;
import esporte.interfaces.Ciclista;
import esporte.interfaces.Corredor;
import esporte.interfaces.Nadador;
import esporte.modelo.Atleta;
import esporte.modelo.CorredorProfissional;
import esporte.modelo.NadadorProfissional;
import esporte.modelo.Triatleta;

public class Main {
    public static void main(String[] args) {
        Atleta[] atletas = {
            new CorredorProfissional("Rafael", 28, NivelAtleta.PROFISSIONAL),
            new NadadorProfissional("Camila", 22, NivelAtleta.AMADOR),
            new Triatleta("Lucas", 31, NivelAtleta.PROFISSIONAL),
            new Triatleta("Fernanda", 19, NivelAtleta.NOVATO)
        };

        System.out.println("=== Informações dos atletas ===");
        for (Atleta a : atletas) {
            a.exibirInformacoes();
            System.out.println();
        }

        System.out.println("=== Executando modalidades via interfaces ===");
        for (Atleta a : atletas) {
            if (a instanceof Corredor) {
                Corredor c = (Corredor) a;
                c.correr();
            }
            if (a instanceof Nadador) {
                Nadador n = (Nadador) a;
                n.nadar();
            }
            if (a instanceof Ciclista) {
                Ciclista c = (Ciclista) a;
                c.pedalar();
            }
        }

        System.out.println("\n=== Mesma classe, várias interfaces (Triatleta) ===");
        Triatleta t = (Triatleta) atletas[2];
        Corredor comoCorredor = t;
        Nadador comoNadador = t;
        Ciclista comoCiclista = t;
        comoCorredor.correr();
        comoNadador.nadar();
        comoCiclista.pedalar();

        System.out.println("\n=== Testando validações ===");
        try {
            new Triatleta("Teste", -5, NivelAtleta.NOVATO);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            new NadadorProfissional("   ", 20, NivelAtleta.AMADOR);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
