package exercises.collections;

/*
 * Objetivo:
 * Aprender o funcionamento do TreeSet e compará-lo com o HashSet.
 */

import java.util.TreeSet;

public class Ex01TreeSetComparsion {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        // Adiciona nomes no TreeSet
        treeSet.add("Pedro");
        treeSet.add("Ana");
        treeSet.add("Carlos");
        treeSet.add("João");
        treeSet.add("Maria");
        treeSet.add("Lucas");
        treeSet.add("Carlos");
        treeSet.add("Pedro");

        // Imprime os nomes
        System.out.println("=== NOMES ADICIONADOS ===");
        for (String nomes : treeSet) {
            System.out.println(nomes);
        }

        // Imprime a quantidade de elementos
        System.out.println("\n-- QUANTIDADE DE ELEMENTOS: " + treeSet.size());

        // Verifica se "ANA" existe
        System.out.println("\n-- ''Ana'' existe? " + treeSet.contains("Ana"));

        // Remove o Carlos
        treeSet.remove("Carlos");


        // Imprime os nomes
        System.out.println("=== NOMES ===");
        for (String nomes : treeSet) {
            System.out.println(nomes);

        }
    }
}
