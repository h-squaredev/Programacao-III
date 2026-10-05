public class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() { return saldo; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + numero + " | saldo: R$ " + String.format("%.2f", saldo);
    }
}
