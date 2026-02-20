package lvl_intermediary.training.arrays;

public class ArrayRelatorioTurma {
    public static void main(String[] args) {

        // Start array and minimum average
        double[] notas = {7, 8, 10, 6, 9};
        final int MEDIA_MINIMA = 7;

        // average
        double soma = 0;
        double media = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        media = soma / notas.length;
        System.out.println("Média da turma: " + media);


        // approved and disapproved
        int aprovados = 0;
        int reprovados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < MEDIA_MINIMA) {
                reprovados++;
            } if (notas[i] >= MEDIA_MINIMA) {
                aprovados++;
            }
        }
        System.out.println("Alunos Aprovados: " + aprovados);
        System.out.println("Alunos Reprovados: " + reprovados);


        // approved percentual
        double percentual = (double) aprovados / notas.length * 100;
        System.out.println("Percentual de aprovação: " + percentual + "%");

    }
}
