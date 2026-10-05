public class Loja {

    public static void buscar(Produto alvo, Produto[] produtos) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equals(alvo)) {
                System.out.println("Produto encontrado na posição " + i);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];
        produtos[0] = new Livro("111", "Dom Casmurro", 39.90, "Machado de Assis");
        produtos[1] = new Livro("222", "O Alquimista", 34.50, "Paulo Coelho");
        produtos[2] = new CD("333", "Acabou Chorare", 29.90, 10);
        produtos[3] = new DVD("444", "Cidade de Deus", 24.90, 130);
        produtos[4] = new DVD("555", "Central do Brasil", 19.90, 113);

        for (Produto p : produtos) {
            System.out.println(p);
        }

        // Duas novas instâncias "idênticas" ao produto[3]
        Produto mesmoCodigo = new DVD("444", "Cidade de Deus", 24.90, 130);
        Produto codigoDiferente = new DVD("999", "Cidade de Deus", 24.90, 130);

        System.out.println("\nBusca com mesmo código de barras:");
        buscar(mesmoCodigo, produtos);
        System.out.println("Busca com código diferente:");
        buscar(codigoDiferente, produtos);

        java.util.Arrays.sort(produtos);
        System.out.println("\nOrdenado (compareTo):");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
