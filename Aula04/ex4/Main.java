public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
            new PagamentoCartao(),
            new PagamentoPix(),
            new PagamentoBoleto()
        };

        double valor = 250.0;

        System.out.println("=== Processando pagamentos ===");
        for (Pagamento p : pagamentos) {
            p.processarPagamento(valor);
        }

        System.out.println("\n=== Cancelando pagamentos ===");
        for (Pagamento p : pagamentos) {
            p.cancelarPagamento();
        }
    }
}
