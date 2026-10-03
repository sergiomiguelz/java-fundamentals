package projects.bankaccount;

public class Main {
    public static void main(String[] args) {
        // 1. Crie uma conta com nome, ID e saldo inicial
        BankAccount conta = new BankAccount("Alex Silva", "12345-6", 1000.00);

        // 2. Mostre as informações da conta
        System.out.println("--- Dados Iniciais ---");
        conta.showInfo();

        // 3. Faça um depósito
        System.out.println("--- Executando Depósito ---");
        conta.depositar(500.50);

        // 4. Faça um saque
        System.out.println("\n--- Executando Saque ---");
        conta.sacar(200.00);

        // 5. Mostre o saldo final usando o getter
        System.out.println("\n--- Resultado Final ---");
        System.out.printf("Saldo final verificado: R$%.2f\n", conta.getSaldo());
    }
}
