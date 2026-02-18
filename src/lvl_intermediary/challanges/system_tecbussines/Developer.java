package lvl_intermediary.challanges.system_tecbussines;

public class Developer extends Employee implements Bonus {

    private DevLevels devLevel; // Developer level (Nível do desenvolvedor)
    private JobTitle jobTitle = JobTitle.Developer;
    // Fixed job title (Cargo fixo)

    int projetosEntregues;  // Delivered projects (Projetos entregues)

    public Developer(String name, double salary, DevLevels devLevel, int projetosEntregues) {
        super(name, salary, JobTitle.Developer);
        this.devLevel = devLevel;
        this.projetosEntregues = projetosEntregues;
    }



    @Override
    public double calcularBonus() {
        // Bonus calculation based on developer level
        switch (devLevel) {
            case JUNIOR:
                return (salary * 0.01) * projetosEntregues;
            case PLENO:
                return (salary * 0.025) * projetosEntregues;
            case SENIOR:
                return (salary * 0.04) * projetosEntregues;
            default:
                return 0;
        }
    }



    @Override
    public double calcularSalarioFinal() {
        // Final salary includes bonus
        return salary + calcularBonus();
    }


    @Override
    public void displayData() {
        System.out.println("Nome: " + name + " | Cargo: " + jobTitle + " " + devLevel + " | Salário: R$" + salary);
        System.out.println("Projetos entregues: " + projetosEntregues + " | Bônus: R$" + calcularBonus());
        System.out.println("Salario final: R$" + calcularSalarioFinal() + "\n");
    }
}
