package exercices.basics.arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayListNinjas {
    public static void main(String[] args) {
        /*Praticando ArrayList*/

        // Instanciando o ArrayList
        List<String> ArrayNinjas = new ArrayList<>();

        // Adicionando elementos no ArrayList
        ArrayNinjas.add("Naruto");
        ArrayNinjas.add("Sasuke");
        ArrayNinjas.add("Neji");
        ArrayNinjas.add("Kakashi");
        ArrayNinjas.add("Rock Lee");

        // Percorrendo o ArrayList e imprimindo cada elemento
        System.out.println("Quantidade total de ninjas: " + ArrayNinjas.size());
        System.out.println("Ninjas: ");
        for (String ninjas : ArrayNinjas){
            System.out.println(ninjas);
        }

        System.out.println("---------------------");

        // Removendo elemento do ArrayList pelo índice
        ArrayNinjas.remove(1);

        // Imprimindo o ArrayList sem forEach
        System.out.println(ArrayNinjas);

        System.out.println("---------------------");

        // Imprimindo apenas ninjas que contém a letra 'a" no nome
        for (String ninjas : ArrayNinjas){
            if (ninjas.contains("a")) {
                System.out.println(ninjas);
            }
        }

        System.out.println("---------------------");

        /* Desafio extra: Criar nova lista e adicionar nela os ninjas que possuem nome com +de 5 letras */

        // Instanciando nova lista
        List<String> aprovados = new ArrayList<>();

        // Percorrendo a lista, verificando se ele possui nome com +de 5 letras e imprimindo
        for (String ninja: ArrayNinjas){
            if(ninja.length() > 5){
                aprovados.add(ninja);
            }
        }
        System.out.println(aprovados);

    }
}
