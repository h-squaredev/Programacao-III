public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public static void main(String[] args) {
        Aluno a = new Aluno("Maria", 20, "2024001");
        System.out.println("Antes: " + a.getNome() + ", " + a.getIdade() + ", " + a.getMatricula());

        a.setNome("Maria Silva");
        a.setIdade(21);
        a.setMatricula("2024002");
        System.out.println("Depois: " + a.getNome() + ", " + a.getIdade() + ", " + a.getMatricula());
    }
}
