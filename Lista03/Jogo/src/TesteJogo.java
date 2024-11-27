public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Super Mario 3","Plataforma", 50.00);
        System.out.println("Nome do jogo: " + jogo.getNome() +
                "\nGênero: " + jogo.getGenero() +
                "\nPreço: R$" + jogo.getPreco());

        jogo.iniciar();
        jogo.pausar();
    }
}
