public class Produto {
    protected String codigoBarras;
    protected String nome;
    protected double preco;

    public Produto(String codigoBarras, String nome, double preco) {
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produto)) return false;
        Produto outro = (Produto) obj;
        return codigoBarras.equals(outro.codigoBarras);
    }

    @Override
    public int hashCode() {
        return codigoBarras.hashCode();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: R$ " + String.format("%.2f", preco);
    }
}
