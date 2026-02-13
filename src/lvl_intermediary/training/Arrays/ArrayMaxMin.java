package lvl_intermediary.training.Arrays;

public class ArrayMaxMin {
    public static void main(String[] args) {
        /* Descobrir qual maior e menor numero do array*/

        // Start Array
        int[] numbers = {15, 3, 22, 8, 10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("========================");

        // Valor inicial
        int maior = numbers[0];
        int menor = numbers[0];

        // Percorrendo o array e verificando qual maior e qual menor
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maior) {
                maior = numbers[i];
            }
            if (numbers[i] < menor) {
                menor = numbers[i];
            }
        }

        // Imprimindo o resultado
        System.out.println("Maior num: " + maior);
        System.out.println("Menor num: " + menor);

    }
}
