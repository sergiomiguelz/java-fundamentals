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

        // Instanciando a fila (Queue)
        Queue<Integer> filaInteiros = new LinkedList<>();

        // Adicionando elementos
        filaInteiros.add(2);
        filaInteiros.add(5);
        filaInteiros.add(7);
        filaInteiros.add(1);
        filaInteiros.add(0);

        // Removendo elementos em ordem FIFO
        System.out.println("Removendo: ");
        int posicao = 1;

        while (!filaInteiros.isEmpty()) {
            int removido = filaInteiros.poll();
            System.out.printf("%d° Elemento removido: %d\n", posicao, removido);
            posicao++;
        }
    }
}
