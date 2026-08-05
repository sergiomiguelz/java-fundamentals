package exercises.collections;

/*
 * Objetivo:
 * Criar uma agenda telefônica utilizando TreeMap para armazenar
 * contatos em ordem alfabética pelo nome.
 */

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex02TreeMapPhoneBook {

    // Scanner compartilhado por todo o programa
    private static final Scanner scanner = new Scanner(System.in);


    // ==========================================
    // MÉTODOS AUXILIARES
    // ==========================================

    /**
     * Verifica se a agenda está vazia.
     *
     * @param agenda agenda que será verificada
     * @return true se a agenda estiver vazia; false caso contrário
     */
    public static boolean isAgendaVazia(TreeMap<String, String> agenda) {

        if (agenda.isEmpty()) {
            System.out.println("A agenda está vazia.");
            return true;
        }

        return false;
    }


    /**
     * Exibe as informações de um contato.
     *
     * @param nome nome do contato
     * @param telefone telefone do contato
     */
    public static void showInfo(String nome, String telefone) {

        System.out.println("------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("------------------------\n");
    }


    /**
     * Exibe todos os contatos cadastrados.
     *
     * O TreeMap mantém os contatos ordenados pelas chaves,
     * que neste programa são os nomes.
     *
     * @param agenda agenda que será exibida
     */
    public static void showAgenda(TreeMap<String, String> agenda) {

        System.out.println("\n— — — CONTATOS DA AGENDA — — —");

        if (isAgendaVazia(agenda)) {
            return;
        }

        // Percorre diretamente cada par Nome -> Telefone
        for (Map.Entry<String, String> contato : agenda.entrySet()) {
            showInfo(contato.getKey(), contato.getValue());
        }
    }


    // ==========================================
    // PROGRAMA PRINCIPAL
    // ==========================================

    public static void main(String[] args) {

        // Chave: nome do contato
        // Valor: telefone do contato
        TreeMap<String, String> phoneBook = new TreeMap<>();

        int option = 0;

        // Mantém o programa em execução até o usuário escolher sair
        while (option != 6) {

            // ==========================================
            // MENU
            // ==========================================

            System.out.println("\n===== AGENDA TELEFÔNICA =====");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Buscar contato");
            System.out.println("3 - Alterar telefone");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Listar contatos");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            // Evita que o programa quebre caso o usuário digite texto
            if (!scanner.hasNextInt()) {
                System.out.println("Digite uma opção numérica válida.");
                scanner.nextLine();
                continue;
            }

            option = scanner.nextInt();
            scanner.nextLine(); // Consome o Enter deixado pelo nextInt()

            switch (option) {

                // ==========================================
                // ADICIONAR CONTATO
                // ==========================================

                case 1:
                    System.out.println("\n[Adicionar contato selecionado]");

                    System.out.print("Nome: ");
                    String inputName = scanner.nextLine()
                            .trim()
                            .toUpperCase(Locale.ROOT);

                    // Impede dois contatos com o mesmo nome
                    if (phoneBook.containsKey(inputName)) {
                        System.out.println("Contato já cadastrado.");
                        break;
                    }

                    System.out.print("Telefone: ");
                    String inputTelephone = scanner.nextLine().trim();

                    phoneBook.put(inputName, inputTelephone);

                    System.out.println("Contato adicionado com sucesso!");
                    break;


                // ==========================================
                // BUSCAR CONTATO
                // ==========================================

                case 2:
                    System.out.println("\n[Buscar contato selecionado]");

                    if (isAgendaVazia(phoneBook)) {
                        break;
                    }

                    System.out.print("Nome do contato: ");
                    String searchedName = scanner.nextLine()
                            .trim()
                            .toUpperCase(Locale.ROOT);

                    if (phoneBook.containsKey(searchedName)) {

                        String foundTelephone = phoneBook.get(searchedName);

                        showInfo(searchedName, foundTelephone);

                    } else {
                        System.out.println("Contato não encontrado.");
                    }

                    break;


                // ==========================================
                // ALTERAR TELEFONE
                // ==========================================

                case 3:
                    System.out.println("\n[Alterar telefone selecionado]");

                    if (isAgendaVazia(phoneBook)) {
                        break;
                    }

                    System.out.print("Nome do contato: ");
                    String nameToUpdate = scanner.nextLine()
                            .trim()
                            .toUpperCase(Locale.ROOT);

                    if (!phoneBook.containsKey(nameToUpdate)) {
                        System.out.println("Contato não encontrado.");
                        break;
                    }

                    // Guarda o telefone atual para exibição posterior
                    String oldTelephone = phoneBook.get(nameToUpdate);

                    System.out.println("\nContato selecionado:");
                    showInfo(nameToUpdate, oldTelephone);

                    System.out.print("Novo telefone: ");
                    String newTelephone = scanner.nextLine().trim();

                    // Impede uma alteração sem mudança real
                    if (newTelephone.equals(oldTelephone)) {
                        System.out.println(
                                "O novo telefone não pode ser igual ao atual."
                        );
                        break;
                    }

                    // Atualiza o valor associado ao nome
                    phoneBook.replace(nameToUpdate, newTelephone);

                    System.out.println("Telefone alterado com sucesso!");

                    System.out.println("------------------------");
                    System.out.println("Nome: " + nameToUpdate);
                    System.out.println("Telefone antigo: " + oldTelephone);
                    System.out.println("Telefone novo: " + newTelephone);
                    System.out.println("------------------------\n");

                    break;


                // ==========================================
                // REMOVER CONTATO
                // ==========================================

                case 4:
                    System.out.println("\n[Remover contato selecionado]");

                    if (isAgendaVazia(phoneBook)) {
                        break;
                    }

                    System.out.print("Nome do contato para remover: ");
                    String nameToRemove = scanner.nextLine()
                            .trim()
                            .toUpperCase(Locale.ROOT);

                    if (phoneBook.containsKey(nameToRemove)) {

                        // Exibe o contato antes da remoção
                        showInfo(
                                nameToRemove,
                                phoneBook.get(nameToRemove)
                        );

                        phoneBook.remove(nameToRemove);

                        System.out.println("Contato removido com sucesso!");

                    } else {
                        System.out.println("Contato não encontrado.");
                    }

                    break;


                // ==========================================
                // LISTAR CONTATOS
                // ==========================================

                case 5:
                    System.out.println("\n[Listar contatos selecionado]");

                    showAgenda(phoneBook);

                    break;


                // ==========================================
                // SAIR
                // ==========================================

                case 6:
                    System.out.println("\nSaindo do programa...");
                    break;


                // ==========================================
                // OPÇÃO INVÁLIDA
                // ==========================================

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}