package exercices.basics.stack;

import java.util.Stack;

/*
 * Objetivo:
 * Simular o funcionamento de um histórico de navegador utilizando uma Stack.
 * Cada site visitado deve ser adicionado ao topo da pilha (push),
 * e a ação de "voltar" deve remover o último site acessado (pop),
 * retornando ao site anterior.
 */

public class SimuladorNavegador {
    public static void main(String[] args) {

        // Instanciando a Stack
        Stack<String> sitesAcessados = new Stack<>();
        sitesAcessados.push("www.google.com");
        sitesAcessados.push("www.youtube.com");
        sitesAcessados.push("www.github.com");
        sitesAcessados.push("www.zara.com");
        sitesAcessados.push("www.instagram.com");

        // Stack auxiliar para exibir sem destruir a original
        Stack<String> copia = new Stack<>();

        // Copiando os elementos
        for (String site : sitesAcessados) {
            copia.push(site);
        }

        // Exibindo histórico (LIFO)
        System.out.println("\nHistórico (mais recente → mais antigo):");
        while (!copia.isEmpty()) {
            System.out.println(copia.pop());
        }

        // Mostrando site atual (topo)
        System.out.println("\nSite atual: " + sitesAcessados.peek());

        // Simulando voltar
        System.out.println("\nVoltando...");
        System.out.println("Você fechou: " + sitesAcessados.pop());

        // Novo topo após voltar
        if (!sitesAcessados.isEmpty()) {
            System.out.println("Você voltou para: " + sitesAcessados.peek());
        } else {
            System.out.println("Nenhum site aberto.");
        }
    }
}