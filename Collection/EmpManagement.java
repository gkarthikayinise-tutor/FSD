package Collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class Employee{
	int empId;
    String empName;
    String department;
    double salary;

    Employee(int empId, String empName, String department, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println(empId + "\t" + empName + "\t"
                + department + "\t" + salary);
    }
}
public class EmpManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. ArrayList to store employee records
        ArrayList<Employee> employees = new ArrayList<>();

        // 2. HashMap to store Department ID and Department Name
        HashMap<Integer, String> departments = new HashMap<>();

        departments.put(101, "Java");
        departments.put(102, "Python");
        departments.put(103, "MERN");
        departments.put(104, "Data Science");

        // 3. Add at least 5 employee records
        employees.add(new Employee(1, "Arun", "Java", 35000));
        employees.add(new Employee(2, "Priya", "Python", 45000));
        employees.add(new Employee(3, "Kumar", "MERN", 50000));
        employees.add(new Employee(4, "Divya", "Java", 30000));
        employees.add(new Employee(5, "Rahul", "Data Science", 60000));

        // 4. Display all employee details
        System.out.println("===== ALL EMPLOYEE DETAILS =====");

        System.out.println("ID\tName\tDepartment\tSalary");

        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            Employee emp = itr.next();
            emp.display();
        }

        // 5. Search employee using Employee ID
        System.out.print("\nEnter Employee ID to Search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Employee emp : employees) {

            if (emp.empId == searchId) {
                System.out.println("\nEmployee Found:");
                emp.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found!");
        }

        // 6. Remove employee using Employee ID
        System.out.print("\nEnter Employee ID to Delete: ");
        int deleteId = sc.nextInt();

        Iterator<Employee> deleteItr = employees.iterator();

        boolean deleted = false;

        while (deleteItr.hasNext()) {

            Employee emp = deleteItr.next();

            if (emp.empId == deleteId) {
                System.out.println("\nDeleted Employee Details:");
                emp.display();

                deleteItr.remove();
                deleted = true;
                break;
            }
        }

        if (!deleted) {
            System.out.println("Employee ID Not Found!");
        }

        // 7. Display Department Details
        System.out.println("\n===== DEPARTMENT DETAILS =====");

        for (Integer deptId : departments.keySet()) {

            System.out.println("Department ID: " + deptId
                    + " Department Name: " + departments.get(deptId));
        }

        // 8. Display employees department-wise
        System.out.println("\n===== DEPARTMENT-WISE EMPLOYEES =====");

        for (Integer deptId : departments.keySet()) {

            String deptName = departments.get(deptId);

            System.out.println("\nDepartment: " + deptName);

            boolean deptFound = false;

            for (Employee emp : employees) {

                if (emp.department.equals(deptName)) {
                    emp.display();
                    deptFound = true;
                }
            }

            if (!deptFound) {
                System.out.println("No Employees Found");
            }
        }

        // 9. Sort employees based on salary using Comparator
        Collections.sort(employees, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {

                return Double.compare(e1.salary, e2.salary);
            }
        });

        System.out.println("\n===== EMPLOYEES SORTED BY SALARY =====");

        System.out.println("ID\tName\tDepartment\tSalary");

        for (Employee emp : employees) {
            emp.display();
        }

        // 10. Display highest-paid employee
        System.out.println("\n===== HIGHEST PAID EMPLOYEE =====");

        if (!employees.isEmpty()) {

            Employee highest = employees.get(employees.size() - 1);

            highest.display();
        } else {
            System.out.println("No Employee Records Available");
        }

        // containsKey() example
        System.out.println("\n===== DEPARTMENT SEARCH =====");

        System.out.print("Enter Department ID: ");
        int deptSearch = sc.nextInt();

        if (departments.containsKey(deptSearch)) {

            System.out.println("Department Found: "
                    + departments.get(deptSearch));

        } else {
            System.out.println("Department Not Found!");
        }

        sc.close();
    }
}
