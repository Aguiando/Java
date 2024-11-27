import java.util.List;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Pirulito",2.0,2);
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: R$" + produto.getPreco());
        System.out.println("Quantidade atual: " +produto.getPreco());

        produto.aumentarQuantidade(8);
        produto.diminuirQuantidade(2);
        System.out.println(produto);

        List<Produto> produtosFiltrados = produto
                .stream()
                .filter(p -> produto.getPreco() > 1000 )
                .distinct()
                .map(p -> produto.getNome(). toUpperCase())
                .toList();

        produtosFiltrados.forEach(p -> System.out.println(produto));
    }
}
