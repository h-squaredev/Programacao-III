public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(101, 89.90);
        Pedido p2 = new Pedido(102, 450.00);
        Pedido p3 = new Pedido(103, 32.50);
        Pedido p4 = new Pedido(104, 1200.00);
        Pedido p5 = new Pedido(105, 15.00);

        p2.alterarStatus(StatusPedido.PAGO);
        p3.alterarStatus(StatusPedido.ENVIADO);
        p4.alterarStatus(StatusPedido.ENTREGUE);
        p5.alterarStatus(StatusPedido.CANCELADO);

        Pedido[] pedidos = { p1, p2, p3, p4, p5 };

        System.out.println("=== Situação dos pedidos ===");
        for (Pedido p : pedidos) {
            p.exibirMensagem();
        }

        System.out.println("\n=== Switch no programa principal ===");
        for (Pedido p : pedidos) {
            switch (p.getStatus()) {
                case AGUARDANDO_PAGAMENTO:
                    System.out.println("Pedido " + p.getNumero() + ": lembrar o cliente de pagar.");
                    break;
                case PAGO:
                    System.out.println("Pedido " + p.getNumero() + ": liberar para separação no estoque.");
                    break;
                case ENVIADO:
                    System.out.println("Pedido " + p.getNumero() + ": enviar código de rastreio.");
                    break;
                case ENTREGUE:
                    System.out.println("Pedido " + p.getNumero() + ": solicitar avaliação da compra.");
                    break;
                case CANCELADO:
                    System.out.println("Pedido " + p.getNumero() + ": nenhuma ação necessária.");
                    break;
            }
        }
    }
}
