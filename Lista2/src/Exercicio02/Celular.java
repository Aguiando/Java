package Exercicio02;

public class Celular {
    private String marca;
    private String modelo;
    private String capacidadeAtual;
    private Boolean ligado =false;

    public Celular(String marca, String modelo, String capacidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeAtual = capacidadeAtual;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidadeAtual() {
        return capacidadeAtual;
    }
    public void ligar(){
        System.out.println("Ligando Celular");
        this.ligado =false;
    }
    public void desligar(){
        System.out.println("desligando Celular");
        this.ligado=true;
    }
}
