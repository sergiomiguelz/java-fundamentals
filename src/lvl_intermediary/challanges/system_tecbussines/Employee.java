package lvl_intermediary.challanges.system_tecbussines;

public abstract class Employee {
    // Employee Data
    String name;
    double salary;
    private JobTitle jobTitle;


    // Constructor to initialize common attributes
    public Employee(String name, double salary, JobTitle jobTitle) {
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Abstract method to calculate final salary
    public abstract double calcularSalarioFinal();

    // Displays basic employee data
    public void displayData(){
        System.out.println("Nome: " + name + " | Cargo: " + jobTitle + " | Salário: R$" + salary);
    }

    // ToString method override
    @Override
    public String toString() {
        return "Employee[Nome: " + name + " | Cargo: " + jobTitle + " | Salário: R$" + salary + "]";
    }
}
