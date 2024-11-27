public class Bicicleta {
    private String marca;
    private String modelo;
    private Integer tamanhoRoda;

    public Bicicleta(String marca, String modelo, Integer tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida!");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido!");
        }
    }

    public Integer getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(Integer tamanhoRoda) {
        if (tamanhoRoda > 0) {
            this.tamanhoRoda = tamanhoRoda;
        } else {
            System.out.println("Erro! Tamanho de roda muito pequeno");
        }
    }
    public void pedalar(){
        System.out.println("Pedalando a bicicleta");
    }
    public void frear(){
        System.out.println("Freiando a bicicleta");
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanhoRoda=" + tamanhoRoda +
                '}';
    }
}
