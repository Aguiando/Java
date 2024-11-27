public class Aluno {
    private String nome;
    private Integer matricula;
    private String curso;
    private double[] notas;

    public Aluno(String nome, Integer matricula, String curso, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
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

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        } else {
            System.out.println("Matricúla inválida!");
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso != null && !curso.isEmpty()) {
            this.curso = curso;
        } else {
            System.out.println("Curso inválido!");
        }
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        if (notas != null && notas.length > 0) {
            this.notas = notas;
        } else {
            System.out.println("Notas inválidas!");
        }
    }
    public double mediaNotas(){
        if(notas == null || notas.length == 0){
            System.out.println("Não há notas para calcular");
        }
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }
}
