public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 0;
    }

    public void abrir() {
        System.out.println("O livro '" + titulo + "' foi aberto.");
        paginaAtual = 1;
    }

    public void lerPagina() {
        if (paginaAtual == 0) {
            System.out.println("Você precisa abrir o livro primeiro.");
        } else if (paginaAtual > numeroDePaginas) {
            System.out.println("Você já leu todas as páginas do livro.");
        } else {
            System.out.println("Lendo a página " + paginaAtual + " do livro '" + titulo + "'.");
            paginaAtual++; // Avança para a próxima página
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public static void main(String[] args) {
        Livro meuLivro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 300);
        meuLivro.abrir();
        meuLivro.lerPagina();
        meuLivro.lerPagina();
        meuLivro.lerPagina();
    }
}
