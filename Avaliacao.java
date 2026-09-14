public class Avaliacao {
    private static final double MEDIA_MINIMA = 6.0;

    private final Aluno aluno;

    public Avaliacao(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public double calcularMedia() {
        return (aluno.getNota1() + aluno.getNota2()) / 2;
    }

    public boolean foiAprovado() {
        return calcularMedia() >= MEDIA_MINIMA;
    }
}