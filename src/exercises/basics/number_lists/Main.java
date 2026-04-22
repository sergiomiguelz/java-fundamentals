package exercises.basics.number_lists;

import java.util.ArrayList;
import java.util.List;

/*
 * Objetivo:
 * Criar um sistema simples para analisar uma lista de números,
 * exibindo informações como soma, maior/menor valor e quantidade de pares e ímpares.
 */

public class Main {
    public static void main(String[] args) {

        // Lista que armazena os números
        List<Integer> numbers = new ArrayList<>();

        // Adicionando números manualmente
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);

        // Variáveis de controle
        int soma = 0;
        int maxNumber = numbers.get(0);
        int minNumber = numbers.get(0);

        int pares = 0;
        int impares = 0;

        // Percorre toda a lista para realizar os cálculos
        for (int i = 0; i < numbers.size(); i++) {
            int numAtual = numbers.get(i);

            // Soma todos os números
            soma += numAtual;

            // Verifica maior número
            if (numAtual > maxNumber) {
                maxNumber = numAtual;
            }

            // Verifica menor número
            if (numAtual < minNumber) {
                minNumber = numAtual;
            }

            // Verifica se é par ou ímpar usando o operador %
            if (numAtual % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibição dos resultados
        System.out.println("Lista: " + numbers);
        System.out.println("Soma: " + soma);
        System.out.println("Maior número: " + maxNumber);
        System.out.println("Menor número: " + minNumber);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
