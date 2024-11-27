public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("","",0);
        cachorro.setNome("Bolt");
        System.out.println("Nome: " + cachorro.getNome());

        cachorro.setRaça("Bulldog");
        System.out.println("Raça do cachorro: " + cachorro.getRaça());

        cachorro.setIdade(5);
        System.out.println("Idade do cachorro: " + cachorro.getIdade());

        cachorro.latir();
        cachorro.correr();
    }
}
