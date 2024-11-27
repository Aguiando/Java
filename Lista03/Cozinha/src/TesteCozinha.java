public class TesteCozinha {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("1", 5,"Branca");
        System.out.println("Tipo de cozinha: " + cozinha.getTipo() +
                "\nCor: " + cozinha.getCor() +
                "\nQuantidade de pessoas: " + cozinha.getQuantidadePessoas());
        cozinha.cozinhar();
        cozinha.limpar();
    }
}
