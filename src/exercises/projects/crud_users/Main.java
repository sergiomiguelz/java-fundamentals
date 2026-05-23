package exercises.projects.crud_users;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        int input_id;
        String input_nome;
        String input_email;

        UsuarioService usuarioService = new UsuarioService();

        while (opcao != 6) {

            System.out.println("================ CRUD Usuários ================");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Buscar usuário por ID");
            System.out.println("4 - Atualizar cadastro do usuário");
            System.out.println("5 - Remover usuario");
            System.out.println("6 - Sair");
            System.out.print("Digite uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números.\n");
                continue;
            }

            switch (opcao) {

                case 1:
                    System.out.println("\n--------- Cadastrar usuário ---------");
                    System.out.print("Nome: ");
                    input_nome = scanner.nextLine();

                    System.out.print("Email: ");
                    input_email = scanner.nextLine();

                    usuarioService.cadastrarUsuario(input_nome, input_email);
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("\n--------- Listar usuários ---------");
                    usuarioService.listarUsuarios();
                    break;

                case 3:
                    System.out.println("\n--------- Buscar usuário por id ---------");
                    System.out.print("Digite o ID: ");
                    input_id = Integer.parseInt(scanner.nextLine());

                    Usuario usuarioEncontrado = usuarioService.buscarPorId(input_id);
                    if (usuarioEncontrado != null) {
                        System.out.println(usuarioEncontrado);
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n--------- Atualizar usuário ---------");
                    System.out.print("Digite o ID do usuário que você deseja atualizar: ");
                    input_id = Integer.parseInt(scanner.nextLine());

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

                case 5:
                    System.out.println("\n--------- Remover usuário ---------");
                    System.out.println("Digite o ID do usuário que você quer remover: ");
                    input_id = Integer.parseInt(scanner.nextLine());


                    Usuario usuarioParaRemover = usuarioService.buscarPorId(input_id);
                    if (usuarioParaRemover != null) {
                        System.out.println("Usuário Removido: " + usuarioParaRemover);
                        usuarioService.removerUsuario(input_id);
                    } else {
                        System.out.println("Usuário não encontrado.\n");
                    }
                    break;

                case 6:
                    System.out.println("Fechando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.\n");
                    break;

            }
        }
        scanner.close();
    }
}
