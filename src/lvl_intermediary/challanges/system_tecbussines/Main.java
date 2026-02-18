package lvl_intermediary.challanges.system_tecbussines;

public class Main {
    public static void main(String[] args) {
        // System header
        System.out.println("================ Employees ================" + "\n");

        // Creating an array of employees and instantiating different employee types
        Employee[] employees = new Employee[3];
        employees[0] = new Developer("Pedro", 14000, DevLevels.SENIOR, 3);
        employees[1] = new Manager("Marcos", 70000);
        employees[2] = new Designer("João", 4200, 7);

        // Looping through employees and displaying their data
        for(Employee employee : employees) {
            employee.displayData();
        }
    }
}
