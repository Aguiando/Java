public class Professor {
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null && !disciplina.isEmpty()) {
            this.disciplina = disciplina;
        } else {
            System.out.println("Disciplina inválida!");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido!");
        }
    }
    public void darAula(){
        System.out.println("O professor " + nome + " está dando aula de " + disciplina);
    }
    public void corrigirProva(){
        System.out.println("O professor " + nome + " está corrigindo a prova de " + disciplina);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", salário=" + salario +
                '}';
    }
}
