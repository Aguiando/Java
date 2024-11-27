public class Animal {
    private String nome;
    private String especie;
    private Integer idade;
    private Double peso;

    public Animal(String nome, String especie, Integer idade, Double peso) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie != null && !especie.isEmpty()) {
            this.especie = especie;
        } else {
            {
                System.out.println("Espécie inválida!");
            }
        }
    }


    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro! Idade abaixo de zero");
        }
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Erro! Peso abaixo de zero Kg");
        }
    }
    public void alimentar(){
        System.out.println("O " + nome + " da espécie " + especie + " está se alimentando!");
    }
    public void domrir(){
        System.out.println("O " + nome + " da espécie " + especie + " está dormindo!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }
}
