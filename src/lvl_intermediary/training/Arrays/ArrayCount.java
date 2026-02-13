package lvl_intermediary.training.Arrays;

public class ArrayCount {
    public static void main(String[] args) {

        /* Treinando lógica com arrays */

        // Start Array
        String[] arrayPessoas = new String[5];
        arrayPessoas[0] = "Marcos";
        arrayPessoas[1] = "Julia";
        arrayPessoas[2] = "Miguel";
        arrayPessoas[3] = "Antonio";
        arrayPessoas[4] = "Luiz";

        // Tamanho do array
        System.out.println("Tamanho do Array: " + arrayPessoas.length);

        // Imprimindo comprimento do array
        for (int i = 0; i < arrayPessoas.length; i++) {
            System.out.println(arrayPessoas[i]);
        }

        // Imprimindo Espaços preenchidos do array
        int total = 0;
        for (int i = 0; i < arrayPessoas.length; i++) {
            if (arrayPessoas[i] != null) {
                total++;
            }
        }
        System.out.println("Espaços preenchidos: " + total);


        // Imprimindo valor de algum índice
        System.out.println("Posição dois: " + arrayPessoas[1]);


        // Mudando valor de algum índice
        arrayPessoas[1] = "José";
        System.out.println("Nova pessoa na posição dois: " + arrayPessoas[1]);


        // Array de Trás para Frente
        for (int i = arrayPessoas.length - 1; i >= 0; i--) {
            System.out.println(arrayPessoas[i]);
        }
    }


}
