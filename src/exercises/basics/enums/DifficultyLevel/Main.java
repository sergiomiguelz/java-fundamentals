package exercises.basics.enums.DifficultyLevel;

public class Main {
    public static void main(String[] args) {

        DifficultyLevel level = DifficultyLevel.MEDIUM;

        switch (level){
            case EASY -> System.out.println("Inimigos possuem 50 de vida.");
            case MEDIUM -> System.out.println("Inimigos possuem 100 de vida.");
            case HARD -> System.out.println("Inimigos possuem 200 de vida.");
        }
    }
}
