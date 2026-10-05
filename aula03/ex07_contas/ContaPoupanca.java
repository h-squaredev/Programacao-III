public class ContaPoupanca extends Conta {
    private double taxaRendimento; // ex.: 0.005 = 0,5%

    public ContaPoupanca(int numero, double saldoInicial, double taxaRendimento) {
        super(numero, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void renderJuros() {
        saldo += saldo * taxaRendimento;
    }

    @Override
    public String toString() {
        return super.toString() + " | taxa: " + (taxaRendimento * 100) + "%";
    }
}
