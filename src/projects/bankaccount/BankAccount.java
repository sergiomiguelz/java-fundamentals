package projects.bankaccount;

public class BankAccount {
    private String name;
    private String ID;
    private double saldo;

    public BankAccount(String name, String ID, double saldo) {
        this.name = name;
        this.ID = ID;
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSaldo() {
        return saldo;
    }


    public double sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            System.out.println("Valor inválido.");
            return saldo;
        }

        saldo -= valor;
        System.out.printf("Saque de R$%.2f realizado com sucesso.\n", valor);
        System.out.printf("Saldo atual: R$%.2f\n", saldo);
        return saldo;
    }

    public double depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return saldo;
        }
        saldo += valor;
        System.out.printf("Depóstio de R$%.2f realizado com sucesso.\n", valor);
        System.out.printf("Saldo atual: R$%.2f\n", saldo);

        return saldo;
    }

    public void showInfo() {
        System.out.println("\n=== INFORMAÇÕES DA CONTA ===");
        System.out.println("Titular: " + name);
        System.out.println("ID da Conta: " + ID);
        System.out.printf("Saldo Atual: R$%.2f\n", saldo);
        System.out.println("============================\n");
    }
}
