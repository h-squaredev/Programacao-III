public class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Boleto de R$ %.2f gerado. Aguardando compensação em até 3 dias úteis.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Boleto cancelado. O código de barras não pode mais ser pago.");
    }
}
