package exercises.basics.exceptions.AgeValidation;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Objetivo:
 * Praticar o lançamento e tratamento manual de exceções
 * utilizando throw.
 */
public class Main {

    /**
     * Valida se a idade está dentro do intervalo permitido.
     *
     * @param age idade que será validada
     * @throws IllegalArgumentException caso a idade seja menor que 0
     *                                  ou maior que 120
     */
    public static void validateAge(int age) {

        // O Java aceita qualquer valor inteiro.
        // Portanto, essa regra precisa ser definida pelo próprio programa.
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Idade inválida.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int age = sc.nextInt();

            // Valida a idade informada pelo usuário.
            // Se for inválida, o método lança uma IllegalArgumentException.
            validateAge(age);

            // Só será executado se nenhuma exceção ocorrer.
            System.out.println("Idade cadastrada com sucesso.");

        } catch (IllegalArgumentException e) {

            // Captura a exceção lançada manualmente pelo validateAge().
            System.out.println("Erro: " + e.getMessage());

        } catch (InputMismatchException e) {

            // nextInt() lança essa exceção caso a entrada não seja um inteiro.
            System.out.println("Erro: digite apenas números inteiros.");
        }

        sc.close();
    }
}