package exercises.basics.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Objetivo:
 * Simular atendimento de clientes:
 * - Adicionar 5 clientes na fila
 * - Atender (remover) 2
 * - Mostrar quem é o próximo a ser atendido
 */

public class AtendimentoCliente {
    public static void main(String[] args) {

        // Criando a fila
        Queue<String> filaClientes = new LinkedList<>();

        // Adicionando clientes
        filaClientes.add("Julia");
        filaClientes.add("Marcos");
        filaClientes.add("João");
        filaClientes.add("Marcela");
        filaClientes.add("Gabriel");

        // Atendendo clientes
        System.out.println("Cliente atendido: " + filaClientes.poll());
        System.out.println("Cliente atendido: " + filaClientes.poll());

        // Cliente a ser atendido
        System.out.println("Próximo cliente: " + filaClientes.peek());



    }
}
