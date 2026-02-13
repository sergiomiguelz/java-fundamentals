package lvl_intermediary.training.Arrays;

public class ArrayMedia {
    public static void main(String[] args) {
        /*Calcular média das notas*/

        // Start Array
        double[] notas = {7, 8, 10, 6, 9};
        double soma = 0;

        // Título da listagem
        System.out.print("Notas do aluno: ");

        // Percorrer o array e somar os valores
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            System.out.print(notas[i] + ", ");
        }

        // Calcular média após a soma final
        double media = soma / notas.length;

        // Pular linha para organizar a saída
        System.out.println();

        System.out.println("Soma das notas: " + soma);
        System.out.println("Média final: " + media);
    }
}
