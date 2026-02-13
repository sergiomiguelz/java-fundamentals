package lvl_intermediary.training.Arrays;

public class ArrayMedia {
    public static void main(String[] args) {
        /*Calcular média das notas*/

        // Start Array
        double[] notas = {7, 8, 10, 6, 9};
        double soma = 0;


        // Título da listagem
        System.out.print("Notas do aluno: | ");

        // Percorrer o array e somar os valores
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            System.out.print(notas[i] + " | ");
        }


        System.out.println();


        // Acima da média ( Minimal Average = 7 )
        final int MIN_AVERAGE = 7;

        System.out.print("Notas do aluno acima da média: | ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= MIN_AVERAGE) {
                System.out.print(notas[i] + " | ");
            }
        }


        System.out.println();


        // Calcular média após a soma final
        double media = soma / notas.length;

        System.out.println("Soma das notas: " + soma);
        System.out.println("Média final: " + media);



        // Status do Aluno
        String status;
        if (media >= MIN_AVERAGE) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
        System.out.println("Status: " + status);
    }
}
