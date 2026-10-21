public abstract class Funcionario {
    protected String nome;
    protected int matricula;
    protected double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getNome() { return nome; }
    public int getMatricula() { return matricula; }
    public double getSalarioBase() { return salarioBase; }
}
