package projects.crud_users;

// Classe modelo que representa um usuário do sistema
public class Usuario {

    // Atributos do usuário
    private int id;
    private String nome;
    private String email;


    // Construtor responsável por criar um usuário
    public Usuario(int id, String nome, String email) {

        this.id = id;
        this.nome = nome;
        this.email = email;

    }


    // ==================== GETTERS E SETTERS ====================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // Exibe o objeto formatado ao usar System.out.println(usuario)
    @Override
    public String toString() {
        return "ID: " + id +
                " | Nome: " + nome +
                " | Email: " + email;
    }
}