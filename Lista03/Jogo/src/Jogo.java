public class Jogo {
    private String nome;
    private String genero;
    private Double preco;

    public Jogo(String nome, String genero, Double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero != null && !genero.isEmpty()) {
            this.genero = genero;
        } else {
            System.out.println("Gênero inválido!");
        }
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro! O preço está abaixo de R$0,00");
        }
    }
    public void iniciar(){
        System.out.println("O jogo " + nome + " do gênero " + genero + " está iniciando");
    }
    public void pausar(){
        System.out.println("O jogo " + nome + " está pausado");
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                '}';
    }
}
