public class ContaCorrente extends ContaBancaria {
    private static final double TAXA = 1.0;

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        double total = valor + TAXA;
        if (valor <= 0 || total > saldo) {
            System.out.printf("Saque de R$ %.2f negado na conta corrente de %s (saldo: R$ %.2f, taxa: R$ %.2f)%n",
                    valor, titular, saldo, TAXA);
            return false;
        }
        saldo -= total;
        System.out.printf("Saque de R$ %.2f realizado na conta corrente de %s (taxa: R$ %.2f)%n", valor, titular, TAXA);
        return true;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado na conta corrente de %s%n", valor, titular);
    }
}
