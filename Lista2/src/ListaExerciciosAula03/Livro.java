package ListaExerciciosAula03;

public class Livro {
    public String titulo;
    public String autor;
    public Integer numDePag;
    private Boolean LivroAberto = false;
    private Integer paginaAtual =1;

    public Livro(String titulo, String autor, Integer numDePag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numDePag = numDePag;
    }

    public Livro(Integer paginaAtual) {
        this.paginaAtual = paginaAtual + 1;
    }
    public void ler(){

    }

    public void abrirLivro(){}
}
