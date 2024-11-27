public class TesteBicicleta {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Passeio",28);
        System.out.println("Marca: " + bicicleta.getMarca() +
                "\nModelo: " + bicicleta.getModelo() +
                "\nTamanho da Roda: " + bicicleta.getTamanhoRoda());
        bicicleta.pedalar();
        bicicleta.frear();
    }
}
