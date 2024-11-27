public class TesteFilme {
    public static void main(String[] args) {
        Filme filme = new Filme("Rocky","Sylvester Stallone", 190);
        System.out.println("Nome do filme: " + filme.getTitulo() +
                 "\nDiretor: " + filme.getDiretor() +
                  "\nDuração: " + filme.getDuracao() + " minutos");

        filme.iniciar();
        filme.parar();
    }
}
