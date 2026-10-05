public class DVD extends Produto {
    private int duracao;

    public DVD(String codigoBarras, String nome, double preco, int duracao) {
        super(codigoBarras, nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duração: " + duracao + " min";
    }
}
