public class PagamentoPix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pix de R$ %.2f confirmado instantaneamente.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pix devolvido ao pagador em até alguns minutos.");
    }
}
