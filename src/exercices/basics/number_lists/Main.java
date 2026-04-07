package exercices.basics.number_lists;

import java.util.ArrayList;
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


        int soma = 0;
        int maxNumber = numbers.get(0);
        int minNumber = numbers.get(0);

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int numAtual = numbers.get(i);

            soma += numAtual;

            if (numAtual > maxNumber) {
                maxNumber = numAtual;
            }

            if (numAtual < minNumber) {
                minNumber = numAtual;
            }

            if (numAtual % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Lista: " + numbers);
        System.out.println("Soma: " + soma);
        System.out.println("Maior número: " + maxNumber);
        System.out.println("Menor número: " + minNumber);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
