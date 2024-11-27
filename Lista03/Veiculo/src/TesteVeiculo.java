public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "abc-123","Branco");
        System.out.println(veiculo);
        veiculo.abastecer();
        veiculo.lavar();
    }
}
