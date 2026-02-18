package lvl_intermediary.challanges.system_ninja;

public class Ninja {
    // Ninja data
    String name;
    RankNinja rank;
    int missions;
    double cash;


    //  Constructor for ninja data
    public Ninja(String name, RankNinja rank, int missions, double cash) {
        this.name = name;
        this.rank = rank;
        this.missions = missions;
        this.cash = cash;
    }

    // ToString
    @Override
    public String toString() {
        return "Ninja[Name=" + name + "]";
    }
}
