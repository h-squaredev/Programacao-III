public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente("Ana", 500.0);
        ContaBancaria cp = new ContaPoupanca("Bruno", 300.0);

        System.out.println("=== Operações válidas ===");
        cc.depositar(200.0);
        cc.sacar(100.0);
        cp.depositar(50.0);
        cp.sacar(150.0);

        System.out.println("\n=== Saques inválidos ===");
        cc.sacar(1000.0);   // saldo insuficiente
        cc.sacar(599.5);    // valor + taxa maior que o saldo
        cp.sacar(500.0);    // saldo insuficiente
        cp.sacar(-10.0);    // valor negativo

        System.out.println("\n=== Saldos finais ===");
        System.out.printf("%s (corrente): R$ %.2f%n", cc.getTitular(), cc.getSaldo());
        System.out.printf("%s (poupança): R$ %.2f%n", cp.getTitular(), cp.getSaldo());
    }
}
