public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null && !placa.isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Placa inválida!");
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
    public void abastecer(){
        System.out.println("O veiculo está abastecendo!");
    }
    public void lavar(){
        System.out.println("O veiculo está limpo!");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
