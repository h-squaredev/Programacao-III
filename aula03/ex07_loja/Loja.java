public class Loja {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];
        produtos[0] = new Livro("Dom Casmurro", 39.90, "Machado de Assis");
        produtos[1] = new Livro("O Alquimista", 34.50, "Paulo Coelho");
        produtos[2] = new CD("Acabou Chorare", 29.90, 10);
        produtos[3] = new DVD("Cidade de Deus", 24.90, 130);
        produtos[4] = new DVD("Central do Brasil", 19.90, 113);

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
