package lvl_intermediary.challanges.system_ninja;

public class Main {
    public static void main(String[] args) {

        /* Challange: You have been hired by Leaf Village to create a simple mission reporting system. */

        // Start Ninjas and array
        Ninja KibaInuzuka = new Ninja("Kiba Inuzuka", RankNinja.GENIN, 20, 90.4);
        Ninja NejiHyuga = new Ninja("Neji Hyuga", RankNinja.GENIN, 52, 240.6);
        Ninja HinataHyuga = new Ninja("Hinata Hyuga", RankNinja.GENIN, 15, 73.2);
        Ninja RockLee = new Ninja("Rock Lee", RankNinja.GENIN, 43, 120.6);
        Ninja NarutoUzumaki = new Ninja("Naruto Uzumaki", RankNinja.GENIN, 50, 117.2);
        Ninja ninjas[] = {KibaInuzuka, NejiHyuga, HinataHyuga, RockLee, NarutoUzumaki};



        /* -------------- Rank Area --------------  */
        // Ninja rank promotion based on missions
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i].missions >= 50) {
                ninjas[i].rank = RankNinja.JONIN;
            } else if (ninjas[i].missions >= 20) {
                ninjas[i].rank = RankNinja.CHUNIN;
            }
        }

        // logic for count ninja rank
        int gennin = 0;
        int chunin = 0;
        int jonin = 0;
        System.out.print("Rank Ninjas: | ");
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i].rank == RankNinja.GENIN) {
                gennin++;
            }
            if (ninjas[i].rank == RankNinja.CHUNIN) {
                chunin++;
            }
            if (ninjas[i].rank == RankNinja.JONIN) {
                jonin++;
            }
        }
        System.out.println("Gennin: " + gennin + " | Chunin: " + chunin + " | Jonin: " + jonin);



        /* -------------- Missions Area --------------  */
        // Logic for  greateast number of missions
        int maxMissionNumber = ninjas[0].missions;
        for (int i = 1; i < ninjas.length; i++) {
            if (ninjas[i].missions > maxMissionNumber) {
                maxMissionNumber = ninjas[i].missions;
            }
        }
        System.out.println("Maior número de missões: " + maxMissionNumber);

        // calc of missions media
        double sumMissions = 0;
        double mediaMissions = 0;
        for (int i = 0; i < ninjas.length; i++) {
            sumMissions += ninjas[i].missions;
        }
        mediaMissions = sumMissions / ninjas.length;
        System.out.println("Media de missões: " + mediaMissions);



        /* -------------- Cash Area --------------  */
        // Logic for greateast cash gain
        double maxGain = ninjas[0].cash;
        for (int i = 1; i < ninjas.length; i++) {
            if (ninjas[i].cash > maxGain) {
                maxGain = ninjas[i].cash;
            }
        }
        System.out.println("Maior ganho de dinheiro com missões: R$" + maxGain);

        // amount raised for the village
        double sumCash = 0;
        for (int i = 0; i < ninjas.length; i++) {
            sumCash += ninjas[i].cash;
        }
        System.out.println("Total dinheiro arrecadado para vila: R$" + sumCash);

    }
}
