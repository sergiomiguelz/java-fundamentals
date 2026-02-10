package lvl_intermediary.challanges.warrior_battle;

public class Warrior {
    String name;
    int life = 100; // vida inicial padrão

    // A arma inicia o ataque.
    // Ela sabe o valor do dano, mas quem controla a vida é o guerreiro.
    public void receberDano(int danoWeapon){
        life -= danoWeapon;
        System.out.println(name + " recebeu " + danoWeapon + " de dano.");

        // pede para o guerreiro aplicar o dano recebido
        System.out.println("Vida atual: " + this.life);
    }
}
