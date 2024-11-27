public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;
    private boolean ligado;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O celular " + modelo + " da marca " + marca + " está ligado.");
        } else {
            System.out.println("O celular já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O celular " + modelo + " da marca " + marca + " está desligado.");
        } else {
            System.out.println("O celular já está desligado.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public boolean isLigado() {
        return ligado;
    }

    public static void main(String[] args) {
        Celular meuCelular = new Celular("Samsung", "Galaxy S21", 4000);
        meuCelular.ligar();
        meuCelular.desligar();
        meuCelular.desligar();
    }
}