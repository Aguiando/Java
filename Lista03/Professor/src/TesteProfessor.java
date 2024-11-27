public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("X","Matemática",5000.00 );
        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("Salário: " + professor.getSalario());

        professor.darAula();
        professor.corrigirProva();
    }
}
