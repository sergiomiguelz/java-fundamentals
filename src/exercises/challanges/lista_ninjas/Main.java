package exercises.challanges.lista_ninjas;

import java.util.LinkedList;
import java.util.List;

/*
 * Objetivo:
 * Gerenciar uma lista de ninjas utilizando LinkedList:
 * - Adicionar ninjas
 * - Remover o primeiro ninja
 * - Adicionar um ninja no início
 * - Acessar ninja por índice
 * - Exibir todos os ninjas
 */

public class Main {

    public static void main(String[] args) {

        // Criando lista de ninjas
        List<Ninja> ninjas = new LinkedList<>();


        // Adicionando ninjas
        ninjas.add(new Ninja("Naruto", "Folha", 19));
        ninjas.add(new Ninja("Sasuke", "Folha", 19));
        ninjas.add(new Ninja("Sakura", "Folha", 18));
        ninjas.add(new Ninja("Shikamaru", "Folha", 20));
        ninjas.add(new Ninja("Neji", "Folha", 21));
        ninjas.add(new Ninja("Tenten", "Folha", 18));


        // Exibindo lista original
        System.out.println("=== LISTA ORIGINAL ===");

        for (Ninja ninja : ninjas) {
            System.out.println(ninja);
        }


        // Removendo primeiro ninja
        ninjas.remove(0);

        System.out.println("\n=== APÓS REMOVER O PRIMEIRO ===");

        for (Ninja ninja : ninjas) {
            System.out.println(ninja);
        }


        // Adicionando ninja no início
        ninjas.add(0, new Ninja("Gaara", "Areia", 18));

        System.out.println("\n=== APÓS ADICIONAR NO INÍCIO ===");

        for (Ninja ninja : ninjas) {
            System.out.println(ninja);
        }


        // Acessando ninja pelo índice
        System.out.println("\n=== NINJA NO ÍNDICE 3 ===");
        System.out.println(ninjas.get(3));

    }
}