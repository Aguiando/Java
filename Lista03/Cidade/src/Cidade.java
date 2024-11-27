public class Cidade {
    private String nome;
    private Integer populacao;
    private String estado;

    public Cidade(String nome, Integer populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
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

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        if (populacao > 0) {
            this.populacao = populacao;
        } else {
            System.out.println("Erro! população está abaixo de 0");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado != null && !estado.isEmpty()) {
            this.estado = estado;
        } else {
            System.out.println("Estado está incorreto ou vazio!");
        }
    }
    public void aumentarPopulacao(Integer aumentar) {
        if (aumentar > 0) {
            populacao += aumentar;
            System.out.println("A população teve um aumento de: " + aumentar + " habitantes");
        } else {
            System.out.println("Operção inválida!");
        }
    }
    public void diminuirPopulacao(Integer diminuir){
        if(diminuir > 0){
            if(populacao >= diminuir){
                populacao -= diminuir;
                System.out.println("A população teve uma diminuição de: " + diminuir + " habitantes");
            }
        }else{
            System.out.println("Operação inválida!");
        }
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", estado='" + estado + '\'' +
                '}';
    }
}
