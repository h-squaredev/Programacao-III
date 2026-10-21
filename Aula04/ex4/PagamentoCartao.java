public class PagamentoCartao implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f aprovado no cartão de crédito.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Compra no cartão cancelada. O estorno aparecerá na próxima fatura.");
    }
}
