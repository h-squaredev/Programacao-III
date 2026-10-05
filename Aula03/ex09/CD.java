public class CD extends Produto {
    private int numeroFaixas;

    public CD(String codigoBarras, String nome, double preco, int numeroFaixas) {
        super(codigoBarras, nome, preco);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Faixas: " + numeroFaixas;
    }
}
