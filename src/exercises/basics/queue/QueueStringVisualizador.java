package exercises.basics.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Objetivo:
 * Criar uma fila de Strings e exibir seus elementos
 * sem remover da fila.
 */

public class QueueStringVisualizador {
    public static void main(String[] args) {

        // Cria a fila
        Queue<String> fila = new LinkedList<>();
        List<String> elementos = List.of("Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5");

        // Adiciona elementos
        fila.addAll(elementos);

        // Exibe informações da fila
        System.out.println("Fila completa: " + fila);
        System.out.println("Primeiro elemento (head): " + fila.peek());
        System.out.println("Tamanho da fila: " + fila.size());

        System.out.println("\nElementos da fila:");

        // Percorre sem remover elementos
        int posicao = 1;
        for (String elemento : fila) {
            System.out.printf("%d° elemento: %s\n", posicao, elemento);
            posicao++;
        }

        // Confirma que a fila não foi alterada
        System.out.println("\nFila após visualização: " + fila);
    }
}