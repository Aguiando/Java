public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("1,99","Rua: Sombrio, n°62", "3241-6157");
        System.out.println("Nome da loja: " + loja.getNome() +
                "\nEndereço: " + loja.getEndereco() +
                "\nTelefone: " + loja.getTelefone());

        loja.abrir();
        loja.fechar();
    }
}
