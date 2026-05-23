package exercises.projects.crud_users;

import java.util.ArrayList;

public class UsuarioService {

    private int proximoId = 1;
    ArrayList<Usuario> users = new ArrayList<>();

    // Métodos:

    private boolean nomeValido(String nome) {
        return !nome.trim().isEmpty();
    }

    private boolean emailValido(String email) {
        return !email.trim().isEmpty() &&
                email.contains("@");
    }

    public void cadastrarUsuario(String nome, String email) {

        if (nomeValido(nome) && emailValido(email)) {
            Usuario usuario = new Usuario(proximoId, nome, email);
            users.add(usuario);
            proximoId++;

            System.out.println("Usuário cadastrado com sucesso!");

        } else {
            System.out.println("Nome ou email inválidos.");
        }

    }


    public void listarUsuarios() {
        if (users.isEmpty()) {
            System.out.println("A lista está vazia.\n");
        } else {
            for (Usuario usuario : users) {
                System.out.println(usuario);
            }
        }
    }

    public Usuario buscarPorId(int id) {
        for (Usuario usuario : users) {
            if (id == usuario.getId()) {
                return usuario;
            }
        }
        return null;
    }


    public void atualizarUsuario(int id, String novoNome, String novoEmail) {
        for (Usuario usuario : users) {
            if (id == usuario.getId()) {
                usuario.setNome(novoNome);
                usuario.setEmail(novoEmail);
            } else {
                System.out.println("Usuário não encontrado.");
            }
        }
    }

    public void removerUsuario(int id) {
        for (Usuario usuario : users) {
            if (id == usuario.getId()) {
                users.remove(id);
            } else {
                System.out.println("Usuário não encontrado.");
            }
        }
    }


}
