package exercises.basics.queue;

import java.util.LinkedList;
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

        // Adiciona elementos
        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");
        fila.add("Elemento 4");

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