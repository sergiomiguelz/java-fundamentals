package exercices.basics.shopping_list;
import java.util.ArrayList;
import java.util.List;

/*
 * Objetivo:
 * Criar uma aplicação simples para gerenciar uma lista de compras
 */

public class Main {

    public static void main(String[] args){
        List<String> listaCompras = new ArrayList<>();

        listaCompras.add("Leite");
        listaCompras.add("Maçã");
        listaCompras.add("Pão");
        listaCompras.add("Ovo");
        listaCompras.add("Queijo");

        System.out.println("Tamanho da lista de compras : " + listaCompras.size());

        for (int i = 0; i < listaCompras.size(); i++) {
            System.out.println((i+1) + " - " + listaCompras.get(i));
        }

        System.out.println("-------------------------");

        listaCompras.remove(2);
        System.out.println("Tamanho da lista de compras : " + listaCompras.size());

        for (int i = 0; i < listaCompras.size(); i++) {
            System.out.println((i+1) + " - " + listaCompras.get(i));
        }

        if (listaCompras.contains("Leite")) {
            System.out.println("Este alimento está na lista");
        }
        else {
            System.out.println("Alimento não escontrado");
        }
    }
}
