package exercises.basics.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Objetivo:
 * Criar uma fila de inteiros e remover todos os elementos,
 * imprimindo os elementos removidos na ordem correta (FIFO).
 */

public class QueueInteger {
    public static void main(String[] args) {

        // Instanciando a Queue
        Queue<Integer> filaInteiros = new LinkedList<>();

        // Adicionando elementos
        filaInteiros.add(2);
        filaInteiros.add(5);
        filaInteiros.add(7);
        filaInteiros.add(1);

        // Removendo elementos em ordem FIFO
        while (!filaInteiros.isEmpty()) {
            System.out.println(filaInteiros.poll());
        }
    }
}
