public class Empresa {
    private String nome;
    private String cnpj;
    private Integer numeroFuncionarios;

    public Empresa(String nome, String cnpj, Integer numeroFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj != null && !cnpj.isEmpty()) {
            this.cnpj = cnpj;
        } else {
            System.out.println("CNPJ inválido!");
        }
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        if (numeroFuncionarios > 0) {
            this.numeroFuncionarios = numeroFuncionarios;
        } else {
            System.out.println("Erro! Número de funcionários abaixo de zero");
        }
    }
    public void contratar(Integer contratar){
        if(numeroFuncionarios > 0){
            numeroFuncionarios += contratar;
            System.out.println("Aumento de " + contratar + " fucionários");
        }else{
            System.out.println("Operação inválida!");
        }
    }
    public void demitir(Integer demitir) {
        if (numeroFuncionarios > 0) {
            if (numeroFuncionarios >= demitir) {
                numeroFuncionarios -= demitir;
                System.out.println("Diminuição de " + demitir + " funcionários");
            } else {
                System.out.println("Operação inválida!");
            }
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", numeroFuncionarios=" + numeroFuncionarios +
                '}';
    }
}
