package lvl_intermediary.challanges.system_tecbussines;

public class Designer extends Employee implements Bonus {

    private JobTitle jobTitle = JobTitle.Designer;
    // Fixed job title for Designer (Cargo fixo)

    int projetosEntregues;  // Delivered projects (Projetos entregues)

    public Designer(String name, double salary, int projetosEntregues) {
        super(name, salary, JobTitle.Designer);
        this.projetosEntregues = projetosEntregues;
    }


    @Override
    public double calcularBonus() {
        // Designer bonus: 2% per project delivered
        return (salary * 0.02) * projetosEntregues;
    }


    @Override
    public double calcularSalarioFinal() {
        // Final salary includes bonus
        return salary + calcularBonus();
    }

    public void displayData() {
        System.out.println("Nome: " + name + " | Cargo: " + jobTitle + " | Salário: R$" + salary );
        System.out.println("Projetos entregues: " + projetosEntregues + " | Bônus: R$" + calcularBonus());
        System.out.println("Salario final: R$" + calcularSalarioFinal() + "\n");
    }
}
