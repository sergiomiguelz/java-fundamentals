package exercises.basics.generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Objetivo:
 * Criar uma lista tipada para armazenar nomes e exibir todos os elementos.
 */

public class ListaNomes {
    public static void main(String[] args) {

        // Instanciação do ArrayList
        List<String> listaNomes = new ArrayList<>();

        // Adiciona elementos ( Strings ) na lista
        listaNomes.add("Julia");
        listaNomes.add("Pedro");
        listaNomes.add("João");
        listaNomes.add("Maria");
        listaNomes.add("Marcos");

        // Percorre e imprime os elemnentos
        for (String nome : listaNomes){
            System.out.println(nome);
        }

    }
}
