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

        // Percorrendo os sites por ordem de abertura
        for (String site : sitesAcessados) {
            System.out.println("Visitando: " + site);
        }

        // Fechando o site atual
        System.out.println("\nVoltando...");
        System.out.println("Você fechou: " + sitesAcessados.pop());

        // Retornando para o site anterior
        System.out.println("Você voltou para: " + sitesAcessados.peek());
    }
}
