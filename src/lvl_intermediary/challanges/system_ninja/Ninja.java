package lvl_intermediary.challanges.system_ninja;

public class Ninja {

    String name;
    RankNinja rank;
    int missions;
    double cash;

    public Ninja(String name, RankNinja rank, int missions, double cash) {
        this.name = name;
        this.rank = rank;
        this.missions = missions;
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Ninja: " + name;
    }
}
