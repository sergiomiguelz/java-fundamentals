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

        // Verificando se a stack é vazia
        if (sitesAcessados.isEmpty()) {
            System.out.println("Nenhum navegador aberto.");
        }
        else {
            // Acessando os elementos por índice
            System.out.println("Visitando: " + sitesAcessados.get(0));
            System.out.println("Visitando: " + sitesAcessados.get(1));
            System.out.println("Visitando: " + sitesAcessados.peek() + "\n");

            // Fechando o site atual
            System.out.println("Voltando...");
            System.out.println("Você fechou: " + sitesAcessados.peek());
            sitesAcessados.peek();
            sitesAcessados.pop();

            // Retornando para o site anterior
            System.out.println("Você voltou para: " + sitesAcessados.peek());
        }
    }
}
