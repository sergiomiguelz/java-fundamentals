package exercises.challanges.lista_ninjas;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * Objetivo:
 * Gerenciar uma lista de ninjas utilizando LinkedList:
 * - Adicionar ninjas
 * - Remover o primeiro ninja
 * - Adicionar um ninja no início
 * - Acessar ninja por índice
 * - Exibir todos os ninjas
 */

public class Main {

    public static void main(String[] args) {

        // Criando lista de ninjas
        List<Ninja> ninjas = new LinkedList<>();


        // Adicionando ninjas
        ninjas.add(new Ninja("Naruto", "Folha", 19));
        ninjas.add(new Ninja("Sasuke", "Folha", 19));
        ninjas.add(new Ninja("Sakura", "Folha", 18));
        ninjas.add(new Ninja("Shikamaru", "Folha", 20));
        ninjas.add(new Ninja("Neji", "Folha", 21));
        ninjas.add(new Ninja("Tenten", "Folha", 18));


        // Scanner
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;


        // Menu principal
        while (opcao != 5) {

            System.out.println("\n======= MENU =======");
            System.out.println("1 - Exibir Lista");
            System.out.println("2 - Remover Primeiro Ninja");
            System.out.println("3 - Adicionar Ninja no Início");
            System.out.println("4 - Buscar Ninja por Índice");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                // Exibir lista
                case 1:

                    System.out.println("\n=== LISTA DE NINJAS ===");

                    for (Ninja ninja : ninjas) {
                        System.out.println(ninja);
                    }

                    break;


                // Remover primeiro ninja
                case 2:

                    if (!ninjas.isEmpty()) {
                        Ninja removido = ninjas.remove(0);

                        System.out.println("\nNinja removido:");
                        System.out.println(removido);
                    } else {
                        System.out.println("\nA lista está vazia.");
                    }

                    break;


                // Adicionar ninja no início
                case 3:
                    scanner.nextLine();

                    System.out.print("\nDigite o nome do ninja: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a vila do ninja: ");
                    String vila = scanner.nextLine();

                    System.out.print("Digite a idade do ninja: ");
                    int idade = scanner.nextInt();

                    ninjas.add(0, new Ninja(nome, vila, idade));

                    System.out.println("\nNinja adicionado com sucesso.");

                    break;


                // Buscar ninja por índice
                case 4:

                    System.out.print("\nDigite o índice do ninja: ");

                    int indice = scanner.nextInt();

                    if (indice >= 0 && indice < ninjas.size()) {
                        System.out.println("\nNinja encontrado:");
                        System.out.println(ninjas.get(indice));
                    } else {
                        System.out.println("\nÍndice inválido.");
                    }

                    break;


                // Sair
                case 5:
                    System.out.println("\nEncerrando sistema...");
                    break;


                // Opção inválida
                default:
                    System.out.println("\nOpção inválida.");
            }
        }

        // Fechando scanner
        scanner.close();
    }
}