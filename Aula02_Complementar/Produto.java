package Aula02_Complementar;

public class Produto {
    // Atributos:
    int id;
    String nome;
    double preco;

    //Métodos:
    void aplicarDesconto(double porcentagem){
        this.preco -= (this.preco * porcentagem) / 100;
    }

    void exibirDetalhes(){
    System.out.printf("\nProduto atualizado com desconto: \nID: %d\nNome: %s\nPreço: R$ %.2f\n", this.id, this.nome, this.preco);    }

    public static void main(String[] args) {
        // Instanciamento de 2 objetos produtos
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        // Atribuicao de valores para os objetos e aplicacao de desconto
        produto1.id = 13254;
        produto1.nome = "Leite 1L";
        produto1.preco = 5.00;
        produto1.aplicarDesconto(10);
        produto1.exibirDetalhes();
        
        produto2.id = 42531;
        produto2.nome = "Energético Monster";
        produto2.preco = 11.00;
        produto2.aplicarDesconto(15);
        produto2.exibirDetalhes();
    }
}
