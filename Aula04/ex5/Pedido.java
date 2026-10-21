public class Pedido {
    private int numero;
    private double valor;
    private StatusPedido status;

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    public void alterarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }

    public void exibirMensagem() {
        String msg;
        switch (status) {
            case AGUARDANDO_PAGAMENTO:
                msg = "Aguardando a confirmação do pagamento.";
                break;
            case PAGO:
                msg = "Pagamento confirmado. Preparando o pedido.";
                break;
            case ENVIADO:
                msg = "Pedido enviado. Já está a caminho!";
                break;
            case ENTREGUE:
                msg = "Pedido entregue ao cliente.";
                break;
            case CANCELADO:
                msg = "Pedido cancelado.";
                break;
            default:
                msg = "Status desconhecido.";
        }
        System.out.printf("Pedido #%d (R$ %.2f) - %s: %s%n", numero, valor, status, msg);
    }

    public int getNumero() { return numero; }
    public double getValor() { return valor; }
    public StatusPedido getStatus() { return status; }
}
