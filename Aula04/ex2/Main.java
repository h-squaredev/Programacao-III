import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da comissão do funcionário comissionado: R$ ");
        double comissao = sc.nextDouble();

        Funcionario f1 = new FuncionarioCLT("Carlos", 1001, 3000.0);
        Funcionario f2 = new FuncionarioComissionado("Marina", 1002, 2500.0, comissao);

        Funcionario[] funcionarios = { f1, f2 };

        System.out.println("\n=== Salários calculados ===");
        for (Funcionario f : funcionarios) {
            System.out.printf("Matrícula %d - %s%n", f.getMatricula(), f.getNome());
            System.out.printf("  Salário-base: R$ %.2f%n", f.getSalarioBase());
            System.out.printf("  Salário final: R$ %.2f%n", f.calcularSalario());
        }
        sc.close();
    }
}
