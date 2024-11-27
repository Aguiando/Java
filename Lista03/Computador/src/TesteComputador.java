public class TesteComputador {
    public static void main(String[] args) {
        Computador computador = new Computador("",0,0);
        computador.setProcessador("Intel");
        System.out.println("Processador: " + computador.getProcessador());

        computador.setMemoriaRam(6);
        System.out.println("Memória RAM: " + computador.getMemoriaRam() + "GB");

        computador.setArmazenamento(1);
        System.out.println("Armazenamento: " + computador.getArmazenamento() + "TB");

        computador.ligado();
        computador.desligado();
        computador.desligado();
        computador.ligado();
    }
}
