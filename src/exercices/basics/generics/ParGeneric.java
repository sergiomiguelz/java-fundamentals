package exercices.basics.generics;

/*
 * Objetivo:
 * Criar uma estrutura genérica reutilizável que armazena dois valores
 * de tipos possivelmente diferentes (T e U).
 */

class Par<T, U> {

    // Atributos genéricos
    private T primeiro;
    private U segundo;

    // Getters e Setters
    public T getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public U getSegundo() {
        return segundo;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }

    // Método para exibir os valores armazenados
    public void showInfo() {
        System.out.println(
                "Primeiro: " + primeiro + "\n" +
                "Segundo: " + segundo
        );
    }
}



/* Main Class */
public class ParGeneric {
    public static void main(String[] args) {

        // Exemplo 1: String + Integer
        Par<String, Integer> pessoa = new Par<>();
        pessoa.setPrimeiro("Pedro");
        pessoa.setSegundo(20);
        pessoa.showInfo();

        System.out.println("------------------");

        // Exemplo 2: Integer + String
        Par<Integer, String> produto = new Par<>();
        produto.setPrimeiro(101);
        produto.setSegundo("Teclado");
        produto.showInfo();

        System.out.println("------------------");

        // Exemplo 3: Boolean + Double
        Par<Boolean, Double> configuracao = new Par<>();
        configuracao.setPrimeiro(true);
        configuracao.setSegundo(99.9);
        configuracao.showInfo();
    }
}