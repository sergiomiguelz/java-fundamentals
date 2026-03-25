package exercices.basics.simplebank_system;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Sergio", 2312, 1008.9);
        acc1.getBalance();
        acc1.deposit(500);
        acc1.withdraw(200);
    }
}
