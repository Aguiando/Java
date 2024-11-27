public class Cozinha {
    private String tipo;
    private Integer quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, Integer quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isEmpty()) {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo inválido!");
        }
    }

    public Integer getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(Integer quantidadePessoas) {
        if (quantidadePessoas > 0) {
            this.quantidadePessoas = quantidadePessoas;
        } else {
            System.out.println("Erro! Quantidade de pessoas inválida!");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor != null && !cor.isEmpty()) {
            this.cor = cor;
        } else {
            System.out.println("Cor inválida!");
        }
    }
    public void cozinhar(){
        System.out.println("Cozinhando para " + quantidadePessoas + " pessoas");
    }
    public void limpar(){
        System.out.println("limpando a cozinha!");
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "tipo='" + tipo + '\'' +
                ", quantidadePessoas=" + quantidadePessoas +
                ", cor='" + cor + '\'' +
                '}';
    }
}
