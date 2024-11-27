public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Bob", "Cachorro", 5, 4.0);
        System.out.println("Nome: " + animal.getNome() +
                "\nEspécie: " + animal.getEspecie() +
                "\nIdade: " + animal.getIdade() + " anos" +
                "\nPeso: " + animal.getPeso() + "Kg");

        animal.alimentar();
        animal.domrir();
    }
}
