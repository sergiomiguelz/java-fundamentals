package exercices.basics.simplebank_system;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Sergio", 2312, 100);

        System.out.println("===================================");
        acc1.withdraw(200);

        System.out.println("===================================");
        acc1.printAccountData();
    }
}
