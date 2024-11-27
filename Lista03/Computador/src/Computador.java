public class Computador {
    private String processador;
    private Integer memoriaRam;
    private Integer armazenamento;
    private Boolean ligado;

    public Computador(String processador, Integer memoriaRam, Integer armazenamento) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        if(processador != null && !processador.isEmpty()){
        this.processador = processador;
    }else{
        System.out.println("Processor invàlido!");
    }
    }

    public Integer getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Integer memoriaRam) {
        if (memoriaRam != null) {
            this.memoriaRam = memoriaRam;
        } else {
            System.out.println("Memoria RAM inválida");
        }
    }

    public Integer getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(Integer armazenamento) {
        if (armazenamento != null && armazenamento > 0) {
            this.armazenamento = armazenamento;
        } else {
            System.out.println("Armazenamento vazio!");
        }
    }
    public void ligado() {
        if (!ligado) {
            ligado = true;
            System.out.println("O computador está ligado");
        } else {
            System.out.println("O computador já está ligado!");
        }
    }
    public void desligado(){
        if(ligado){
            ligado = false;
            System.out.println("O computador foi desligado");
        }
        System.out.println("O computador já está desligado!");
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
                ", armazenamento=" + armazenamento +
                '}';
    }
}
