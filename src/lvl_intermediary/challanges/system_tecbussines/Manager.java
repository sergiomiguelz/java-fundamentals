package lvl_intermediary.challanges.system_tecbussines;

public class Manager extends Employee {

    private JobTitle jobTitle = JobTitle.Manager;
    // Fixed job title for Manager (Cargo fixo para Manager)

    public Manager(String name, double salary) {
        super(name, salary, JobTitle.Manager);
    }

    @Override
    public double calcularSalarioFinal() {
        // Manager does not receive bonus in this version
        return salary;
    }

    @Override
    public void displayData() {
        System.out.println("Nome: " + name + " | Cargo: " + jobTitle + " | Salário: R$" + salary + "\n");
    }
}
