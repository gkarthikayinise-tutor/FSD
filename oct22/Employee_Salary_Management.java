package oct22;

class Employee {
    int employeeId;
    String name;
    int basicSalary;

    Employee(int employeeId, String name, int basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
    	System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {

    PermanentEmployee(int employeeId, String name, int basicSalary) {
        super(employeeId, name, basicSalary);
    }

    void calculateSalary() {
        double totalSalary = basicSalary + (basicSalary * 0.20);

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowance (20%): " + (basicSalary * 0.20));
        System.out.println("Total Salary: " + totalSalary);
    }
}

class ContractEmployee extends Employee {

    ContractEmployee(int employeeId, String name, int basicSalary) {
        super(employeeId, name, basicSalary);
    }

    void calculateSalary() {
        int totalSalary = basicSalary + 2000;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: 2000");
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class Employee_Salary_Management {

    public static void main(String[] args) {

    	PermanentEmployee emp1 = new PermanentEmployee(101, "Karthi", 25000);
    	ContractEmployee emp2 = new ContractEmployee(102, "Ravi", 18000);
        Employee emp3 = new Employee(103,"Selvi",4000);

        System.out.println("Permanent Employee Details");
        emp1.calculateSalary();

        System.out.println("\nContract Employee Details");
        emp2.calculateSalary();
        
        System.out.println("\nEmployee Details");
        emp3.calculateSalary();
    }
}