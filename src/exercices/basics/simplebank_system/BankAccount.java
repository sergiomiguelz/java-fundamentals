package exercices.basics.simplebank_system;

public class BankAccount {
    // Declaration of variables
    private String owner;
    private int accountNumber;
    private double balance;
    private double withdrawRate = 5;


    // Constructor que garante que a conta seja criada apenas com dados válidos
    // Evita objetos inconsistentes no sistema
    public BankAccount(String owner, int accountNumber, double balance) {
        if (owner == null || owner.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do titular não pode ser vazio");
        }
        if (accountNumber <= 0) {
            throw new IllegalArgumentException("O número da conta(accountNumber) não pode ser <=0");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("O valor do saldo(balance) não pode ser negativo");
        }
        this.owner = owner.trim();
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Metodo para depositar valor à conta
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Você não pode depositar valores menores ou iguais à 0!");
            return;
        }
        balance += amount;
        System.out.printf("Valor de R$%.2f depositado com sucesso!\nSaldo atual: R$%.2f\n", amount, balance);
    }


    // Metodo para sacar o dinheiro
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Você não pode sacar um valor negativo ou nulo! Tente Novamente.");
            return;
        }
        if (balance < amount + withdrawRate) {
            System.out.printf("Valor indisponível para seu saldo atual!\nSaldo atual: R$%.2f\n", balance);
            return;
        }
        balance -= (amount + withdrawRate);
        System.out.printf("Saque realizado com sucesso!\nSaldo atual: R$%.2f\n", balance);
    }


    // Retorna o saldo atual da conta ( não exibe, apenas retorna )
    public double getBalance() {
        return balance;
    }


    // Metodo para definir novo valor à taxa
    public void setWithdrawRate(double withdrawRate) {
        if (withdrawRate < 0) {
            System.out.println("Valor de taxa inválido!");
            return;
        }
        this.withdrawRate = withdrawRate;
    }


    // Metodo para printar as informacoes da conta
    public void printAccountData() {
        System.out.printf("Titular: %s | Conta: %d | Saldo: R$%.2f\n", owner, accountNumber, balance);
    }
}