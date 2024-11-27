public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("", 0,0F);
        pessoa.setNome("Daniel");
        System.out.println("Nome: " + pessoa.getNome());
        pessoa.setIdade(26);
        System.out.println("Idade: " + pessoa.getIdade());
        pessoa.setAltura(1.75F);
        System.out.println("Altura: " + pessoa.getAltura());
    }
}
