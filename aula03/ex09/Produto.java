public class Produto implements Comparable<Produto> {
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

    // Ordenação por NOME.
    @Override
    public int compareTo(Produto outro) {
        return this.nome.compareTo(outro.nome);
    }

    // Para ordenar por PREÇO, comente o método acima e use este:
    // @Override
    // public int compareTo(Produto outro) {
    //     return Double.compare(this.preco, outro.preco);
    // }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: R$ " + String.format("%.2f", preco);
    }
}
