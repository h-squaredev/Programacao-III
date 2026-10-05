public class Livro {
    private String titulo;
    private String autor;

    public Livro() {
        this.titulo = "Sem título";
        this.autor = "Autor desconhecido";
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibir() {
        System.out.println("Título: " + titulo + " | Autor: " + autor);
    }

    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis");
        l1.exibir();
        l2.exibir();
    }
}
