package exercises.basics.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Objetivo:
 * Simular fila de impressão:
 * - Adicionar documentos
 * - Processar (remover) um por um
 * - Mostrar qual está sendo impresso
 */

public class QueueImpressao {
    public static void main(String[] args) {

        // Cria fila de impressão e adiciona documentos
        Queue<String> filaDeImpressao = new LinkedList<>();
        List<String> documentos = List.of("Doc1", "Doc2", "Doc3", "Doc4");
        filaDeImpressao.addAll(documentos);

        // Processa os documentos em FIFO
        System.out.println("Iniciando fila de impressão...");
        int posicao = 1;
        while (!filaDeImpressao.isEmpty()) {
            System.out.printf("Imprimindo (%d°): %s\n", posicao, filaDeImpressao.poll());
            posicao++;
        }

        // Exibe o finalizamento do processo
        System.out.println("\nFila de impressão finalizada.");
    }
}
