public class Cachorro {
    private String nome;
    private String raça;
    private Integer idade;

    public Cachorro(String nome, String raça, Integer idade) {
        this.nome = nome;
        this.raça = raça;
        this.idade = idade;
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

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        if (raça != null && !raça.isEmpty()) {
            this.raça = raça;
        } else {
            System.out.println("Raça inválida!");
        }
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade != null && idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
    public void latir(){
        System.out.println("O cachorro está latindo!");
    }
    public void correr(){
        System.out.println("O cachorro está correndo");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raça='" + raça + '\'' +
                ", idade=" + idade +
                '}';
    }
}
