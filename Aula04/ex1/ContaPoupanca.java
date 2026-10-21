public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            System.out.printf("Saque de R$ %.2f negado na poupança de %s (saldo: R$ %.2f)%n", valor, titular, saldo);
            return false;
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado na poupança de %s%n", valor, titular);
        return true;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado na poupança de %s%n", valor, titular);
    }
}
