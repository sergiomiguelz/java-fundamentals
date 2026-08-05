package projects.crud_users;

import java.util.Scanner;


// Classe principal responsável pela interação com o usuário
public class Main {

    // Método auxiliar para leitura segura de ID
    private static int lerId(Scanner scanner) {

        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.print("ID inválido. Digite apenas números: ");
            }
        }
    }

    public static void main(String[] args) {

        // Scanner responsável por ler entradas do console
        Scanner scanner = new Scanner(System.in);

        // Variável que controla o loop do menu
        int opcao = 0;

        // Variáveis auxiliares
        int input_id;
        String input_nome;
        String input_email;


        // Instância da classe responsável pelo CRUD
        UsuarioService usuarioService = new UsuarioService();


        // Loop principal do sistema
        while (opcao != 6) {

            // ==================== MENU ====================

            System.out.println("================ CRUD Usuários ================");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Buscar usuário por ID");
            System.out.println("4 - Atualizar cadastro do usuário");
            System.out.println("5 - Remover usuario");
            System.out.println("6 - Sair");

            System.out.print("Digite uma opção: ");


            // Tratamento de erro caso usuário digite texto
            try {
                opcao = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números.\n");

                continue;
            }


            // ==================== OPÇÕES DO MENU ====================

            switch (opcao) {
                // ==================== CADASTRAR ====================

                case 1:
                    System.out.println("\n--------- Cadastrar usuário ---------");

                    System.out.print("Nome: ");
                    input_nome = scanner.nextLine();

                    System.out.print("Email: ");
                    input_email = scanner.nextLine();

                    usuarioService.cadastrarUsuario(input_nome, input_email);

                    System.out.println(" ");
                    break;


                // ==================== LISTAR ====================

                case 2:
                    System.out.println("\n--------- Listar usuários ---------");

                    usuarioService.listarUsuarios();

                    break;


                // ==================== BUSCAR ====================

                case 3:
                    System.out.println("\n--------- Buscar usuário por id ---------");

                    System.out.print("Digite o ID: ");
                    input_id = lerId(scanner);

                    Usuario usuarioEncontrado = usuarioService.buscarPorId(input_id);

                    if (usuarioEncontrado != null) {
                        System.out.println(usuarioEncontrado);
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }

                    break;


                // ==================== ATUALIZAR ====================

                case 4:
                    System.out.println("\n--------- Atualizar usuário ---------");

                    System.out.print("Digite o ID do usuário que você deseja atualizar: ");
                    input_id = lerId(scanner);

                    Usuario usuarioParaAtualizar = usuarioService.buscarPorId(input_id);

                    if (usuarioParaAtualizar != null) {
                        System.out.println("Usuário selecionado: " + usuarioParaAtualizar);

                        System.out.println("\nDigite as novas informações: ");

                        System.out.print("Nome: ");
                        input_nome = scanner.nextLine();

                        System.out.print("Email: ");
                        input_email = scanner.nextLine();

                        usuarioService.atualizarUsuario(input_id, input_nome, input_email);

                        System.out.println(" ");
                    } else {
                        System.out.println("Usuário não encontrado.\n");
                    }

                    break;


                // ==================== REMOVER ====================

                case 5:
                    System.out.println("\n--------- Remover usuário ---------");

                    System.out.print("Digite o ID do usuário que você quer remover: ");
                    input_id = lerId(scanner);

                    Usuario usuarioParaRemover = usuarioService.buscarPorId(input_id);

                    if (usuarioParaRemover != null) {
                        System.out.println("Usuário removido: " + usuarioParaRemover);

                        usuarioService.removerUsuario(input_id);
                    } else {
                        System.out.println("Usuário não encontrado.\n");
                    }
                    break;


                // ==================== SAIR ====================

                case 6:
                    System.out.println("Fechando sistema...");
                    break;


                // ==================== OPÇÃO INVÁLIDA ====================

                default:
                    System.out.println("Opção inválida.\n");
                    break;
            }

        }

        // Fecha o Scanner ao encerrar o programa
        scanner.close();

    }
}