public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Matrícula: " + matricula);
    }

    public static void main(String[] args) {
        Aluno a = new Aluno("Maria", 20, "2024001");
        a.exibir();
    }
}
