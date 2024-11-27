public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Real Madrid","Ancelotti",35);
        System.out.println("Nome do time: " + time.getNome() +
                "\nTécnico: " + time.getTecnico() +
                "\nNúmero de jogadores: " + time.getNumJogadores());

        time.adicionar(2);
        System.out.println("Quantidade atual de jogadores: " + time.getNumJogadores());

        time.remover(3);
        System.out.println("Quantidade atual de jogadores: " + time.getNumJogadores());
    }
}
