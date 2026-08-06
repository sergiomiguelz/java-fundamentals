package exercises.basics.enums.TrafficLight;

/*
 * Objetivo:
 * Praticar enum utilizando valores recebidos pelo usuário
 * e tomada de decisão.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LightColor light;

        System.out.print("Digite a cor do semáforo: ");
        String inputColor = sc.nextLine().trim().toUpperCase(Locale.ROOT);


        light = LightColor.valueOf(inputColor);


        switch (light) {
            case RED -> System.out.println("Pare.");
            case YELLOW -> System.out.println("Atenção.");
            case GREEN -> System.out.println("Siga.");
            default -> System.out.println("Cor inválida.");
        }

        sc.close();
    }
}
