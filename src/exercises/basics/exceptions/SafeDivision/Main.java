package exercises.basics.exceptions.SafeDivision;

/*
 * Objetivo:
 * Introduzir o tratamento de exceções utilizando try-catch.
 *
 * O programa realiza uma divisão entre dois números inteiros
 * e trata possíveis erros de entrada e divisão por zero.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Lê o primeiro número.
            // Caso o usuário digite algo que não seja um inteiro,
            // o nextInt() lança uma InputMismatchException.
            System.out.print("Digite o 1° número: ");
            int firstNumber = sc.nextInt();

            // Lê o segundo número.
            System.out.print("Digite o 2° número: ");
            int secondNumber = sc.nextInt();

            // A divisão inteira por zero lança uma ArithmeticException.
            int division = firstNumber / secondNumber;

            // Executado somente se nenhuma exceção ocorrer anteriormente.
            System.out.printf(
                    "%d / %d = %d%n",
                    firstNumber,
                    secondNumber,
                    division
            );

        } catch (ArithmeticException e) {
            // Trata especificamente a tentativa de divisão por zero.
            System.out.println("Erro: impossível dividir por zero.");

        } catch (InputMismatchException e) {
            // Trata entradas incompatíveis com o tipo int.
            System.out.println("Erro: digite apenas números inteiros.");
        }

        sc.close();
    }
}