package exercises.basics.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Objetivo:
 * Verificar se uma fila está vazia após remover todos os elementos.
 */

public class QueueVazia {
    public static void main(String[] args) {

        // Cria a fila e adiciona elementos
        Queue<Integer> fila = new LinkedList<>();
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        // Remove os elementos da fila
        while(!fila.isEmpty()){
            fila.poll();
        }

        // Verifica se a fila está vazia
        if(fila.isEmpty()){
            System.out.println("A Fila está vazia.");
        } else {
            System.out.println("A Fila possui os seguintes elementos: " + fila);
        }
    }
}
