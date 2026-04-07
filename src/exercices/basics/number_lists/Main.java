package exercices.basics.number_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Objetivo:
 * Criar um sistema simples para analisar uma lista de números,
 * exibindo informações como soma, maior/menor valor e quantidade de pares e ímpares.
 */

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);

        // Organiza o array em numeros crescentes
        numbers.sort(Comparator.naturalOrder());

        // Soma todos os elementos do array
        int soma = 0;
        for (int number : numbers) {
            soma += number;
        }

        // Logica para maior e menor numero
        int maxNumber = numbers.get(0);
        int minNumber = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int numAtual = numbers.get(i);

            if (numAtual > maxNumber)
                maxNumber = numAtual;// Atualiza maior
            if (numAtual < minNumber)
                minNumber = numAtual; // Atualiza menor
        }



        System.out.println("Maior numero: " + maxNumber + "\nMenor numero: " + minNumber);
        System.out.println(soma);
        System.out.println(numbers);
    }
}
