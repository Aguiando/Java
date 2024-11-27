import java.util.Objects;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidadeEstoque;

    public Produto(String nome, Double preco, Integer quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco < 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("Quantidade Inválida!");
        }
    }
    public void aumentarQuantidade(Integer quantidade){
        if(quantidade >0){
            quantidadeEstoque += quantidade;
            System.out.println("A quantidade do produto aumentou para o total de: " + quantidade);
        }else{
            System.out.println("Operação Inválida!");
        }
    }
    public void diminuirQuantidade(Integer quantidade){
        if(quantidade > 0){
            if(quantidade <= quantidadeEstoque){
                quantidadeEstoque -= quantidade;
                System.out.println("A quantidade do produto diminuiu para o total de: " + quantidade);
            }
        }
    }

    @Override
    public String toString() {
        return "hashcode = " + hashCode() + '\'' +
                "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
