package lvl_intermediary.challanges.warrior_battle;

public class Main {
    public static void main(String[] args) {

        /* Objetivo do desafio: Demonstrar a comunicação entre objetos.
         * A arma inicia o ataque, mas quem controla e altera a própria vida é o guerreiro. */

        // criação do guerreiro
        Warrior Esparta = new Warrior();
        Esparta.name = "Esparta";

        // criação da arma
        Weapon Machado = new Weapon();
        Machado.nome = "Machado";
        Machado.damage = 80;

        // a arma ataca o guerreiro
        Machado.atacar(Esparta);

    }
}
