public class Filme {
    private String titulo;
    private String diretor;
    private Integer duracao;

    public Filme(String titulo, String diretor, Integer duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Titulo inválido!");
        }
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        if (diretor != null && !diretor.isEmpty()) {
            this.diretor = diretor;
        } else {
            System.out.println("Diretor inválido!");
        }
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Erro! Duração de filme abaixo de 0");
        }
    }
    public void iniciar(){
        System.out.println("O filme " + titulo + " do diretor " + diretor + " com duração de " + duracao + " está iniciando!");
    }
    public void parar(){
        System.out.println("O filme " + titulo + " do diretor " + diretor +  " está pausado!");
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
