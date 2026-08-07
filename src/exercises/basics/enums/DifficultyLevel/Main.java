package exercises.basics.enums.DifficultyLevel;

/*
 * Objetivo:
 * Praticar o uso de enum como atributo de uma classe.
 */
public class Main {

    public static void main(String[] args) {

        // Cria um jogador inicialmente na dificuldade HARD
        Player player1 = new Player("Pedro", DifficultyLevel.HARD);

        System.out.println("=== PLAYER ===");
        System.out.println(player1);

        // Altera a dificuldade do jogador
        player1.setDifficulty(DifficultyLevel.MEDIUM);

        // Exibe novamente para confirmar a alteração
        System.out.println("\n=== UPDATED PLAYER ===");
        System.out.println(player1);
    }
}