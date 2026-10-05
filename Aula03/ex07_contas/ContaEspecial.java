public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double saldoInicial, double limite) {
        super(numero, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo + limite) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " | limite: R$ " + String.format("%.2f", limite);
    }
}
