public class Livro {
    private String titulo;
    private String autor;
    private Integer tamanhoArquivo;

    public Livro(String titulo, String autor, Integer tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Título inválido!");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Autor inválido!");
        }
    }

    public Integer getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(Integer tamanhoArquivo) {
        if (tamanhoArquivo > 0) {
            this.tamanhoArquivo = tamanhoArquivo;
        } else {
            System.out.println("Erro! Tamanho de arquivo inválido!");
        }
    }
    public void abrir(){
        System.out.println("O livro " + titulo + " do autor " + autor + " está aberto!");
    }
    public void fechar(){
        System.out.println("O livro " + titulo + " está fechado!");
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tamanhoArquivo=" + tamanhoArquivo +
                '}';
    }
}
