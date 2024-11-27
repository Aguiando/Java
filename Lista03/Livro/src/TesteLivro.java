public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("A Turma da Mônica", "Monteiro Lobato", 5);
        System.out.println("Nome do livro: " + livro.getTitulo() +
                "\nAutor: " + livro.getAutor() +
                "\nTamanho: " + livro.getTamanhoArquivo() + " Mb");
        livro.abrir();
        livro.fechar();
    }
}
