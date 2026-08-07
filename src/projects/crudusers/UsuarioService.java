package projects.crudusers;

import java.util.ArrayList;

// Classe responsável pelas operações CRUD dos usuários
public class UsuarioService {

    // Contador utilizado para gerar IDs automáticos
    private int proximoId = 1;

    // Lista que armazena os usuários em memória
    ArrayList<Usuario> users = new ArrayList<>();


    // ==================== VALIDAÇÕES ====================

    // Verifica se o nome não está vazio
    private boolean nomeValido(String nome) {
        return !nome.trim().isEmpty();
    }

    // Verifica se o email não está vazio e possui "@"
    private boolean emailValido(String email) {
        return !email.trim().isEmpty() &&
                email.contains("@");
    }


    // ==================== CREATE ====================

    public void cadastrarUsuario(String nome, String email) {

        // Só cadastra se nome e email forem válidos
        if (nomeValido(nome) && emailValido(email)) {

            Usuario usuario = new Usuario(proximoId, nome, email);

            users.add(usuario);

            proximoId++; // incrementa o próximo ID

            System.out.println("Usuário cadastrado com sucesso!");

        } else {
            System.out.println("Nome ou email inválidos.");
        }
    }


    // ==================== READ ====================

    public void listarUsuarios() {


        if (users.isEmpty()) {
            // Se a lista estiver vazia
            System.out.println("A lista está vazia.\n");

        } else {
            // Se não percorre e imprime todos os usuários
            for (Usuario usuario : users) {
                System.out.println(usuario);
            }
        }
    }

    public Usuario buscarPorId(int id) {

        // Procura usuário pelo ID
        for (Usuario usuario : users) {
            if (id == usuario.getId()) {
                return usuario;
            }
        }
        return null;
    }


    // ==================== UPDATE ====================

    public void atualizarUsuario(int id, String novoNome, String novoEmail) {

        for (Usuario usuario : users) {
            if (id == usuario.getId()) {
                usuario.setNome(novoNome);
                usuario.setEmail(novoEmail);

                System.out.println("Usuário atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }


    // ==================== DELETE ====================

    public void removerUsuario(int id) {

        for (Usuario usuario : users) {
            if (id == usuario.getId()) {
                users.remove(usuario);

                System.out.println("Usuário removido com sucesso!");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }
}