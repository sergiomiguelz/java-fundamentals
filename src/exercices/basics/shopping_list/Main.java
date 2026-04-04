package exercices.basics.shopping_list;
import java.util.ArrayList;
import java.util.List;

/*
 * Objetivo:
 * Criar uma aplicação simples para gerenciar uma lista de compras
 */

public class Main {

    public static void main(String[] args) {

        // Criação da lista de compras
        List<String> listaCompras = new ArrayList<>();

        // Adicionando itens na lista
        listaCompras.add("Leite");
        listaCompras.add("Maçã");
        listaCompras.add("Pão");
        listaCompras.add("Ovo");
        listaCompras.add("Queijo");

        // Exibindo tamanho e itens da lista
        System.out.println("Tamanho da lista de compras: " + listaCompras.size());
        exibirLista(listaCompras);

        System.out.println("-------------------------");

        // Removendo item pelo índice (posição 2 = "Pão")
        listaCompras.remove(2);

        // Exibindo lista atualizada
        System.out.println("Tamanho da lista de compras: " + listaCompras.size());
        exibirLista(listaCompras);

        System.out.println("-------------------------");

        // Verificando se um item existe na lista
        if (listaCompras.contains("Leite")) {
            System.out.println("O item 'Leite' está na lista");
        } else {
            System.out.println("O item 'Leite' não foi encontrado");
        }
    }

    // Método auxiliar para exibir a lista numerada
    public static void exibirLista(List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + " - " + lista.get(i));
        }
    }
}
