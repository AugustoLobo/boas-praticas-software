public class Sistema {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos", 8, 7);
        Avaliacao avaliacao = new Avaliacao(aluno);

        exibirResultado(avaliacao);
    }

    private static void exibirResultado(Avaliacao avaliacao) {
        System.out.println("Aluno: " + avaliacao.getAluno().getNome());
        System.out.println("Média: " + avaliacao.calcularMedia());
        System.out.println(avaliacao.foiAprovado() ? "Aprovado" : "Reprovado");
    }
}