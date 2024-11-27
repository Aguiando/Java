public class TesteCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Itajaí", 300000,"SC");
        System.out.println("Município: " + cidade.getNome() +
                " \nEstado: " + cidade.getEstado() +
                " \nPopulação: " + cidade.getPopulacao() + " habitantes");

        cidade.aumentarPopulacao(500000);
        System.out.println("População atual: " + cidade.getPopulacao() + " habitantes");

        cidade.diminuirPopulacao(200000);
        System.out.println("População atual: " + cidade.getPopulacao() + " habitantes");
    }
}
