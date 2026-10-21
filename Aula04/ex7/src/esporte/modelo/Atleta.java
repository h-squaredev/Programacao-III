package esporte.modelo;

import esporte.enums.NivelAtleta;

public abstract class Atleta {
    protected String nome;
    protected int idade;
    protected NivelAtleta nivel;

    public Atleta(String nome, int idade, NivelAtleta nivel) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
        this.nome = nome;
        this.idade = idade;
        this.nivel = nivel;
    }

    public abstract void exibirModalidades();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nível: " + nivel);
        exibirModalidades();
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public NivelAtleta getNivel() { return nivel; }
}
