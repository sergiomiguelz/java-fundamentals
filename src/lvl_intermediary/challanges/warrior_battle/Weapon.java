package lvl_intermediary.challanges.warrior_battle;

public class Weapon {
    String nome;
    int damage;

    // O próprio guerreiro é responsável por alterar sua vida.
    public void atacar(Warrior guerreiro){
        System.out.println("Arma " + this.nome + " causou " + this.damage + " de dano ao "+ guerreiro.name);
        guerreiro.receberDano(this.damage);
    }
}
