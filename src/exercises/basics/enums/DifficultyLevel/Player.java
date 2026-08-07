package exercises.basics.enums.DifficultyLevel;

/*
 * Representa um jogador e sua dificuldade atual.
 *
 * O atributo difficulty utiliza o enum DifficultyLevel,
 * garantindo que o jogador possua apenas uma das
 * dificuldades definidas pelo programa.
 */
public class Player {

    private String name;
    private DifficultyLevel difficulty;

    // Cria um jogador com nome e dificuldade inicial
    public Player(String name, DifficultyLevel difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DifficultyLevel getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(DifficultyLevel difficulty) {
        this.difficulty = difficulty;
    }

    // Define como o objeto Player será exibido ao ser impresso
    @Override
    public String toString() {
        return "Name: " + name +
                "\nLevel: " + difficulty;
    }
}