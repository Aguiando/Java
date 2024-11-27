public class AlunoTeste {
    public static void main(String[] args) {
        double[] notas = {8.5, 9, 7, 8.5};
        Aluno aluno = new Aluno("Daniel",123456,"ADS", notas);
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());

        double media = aluno.mediaNotas();
        System.out.println("Média das notas: " + media);
    }
}
