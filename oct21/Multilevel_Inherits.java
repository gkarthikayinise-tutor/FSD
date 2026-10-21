//2. Multilevel Inheritance
//A class inherits from a child class, forming a chain of inheritance.
//Task 4: Person, Employee and Manager
//Problem Statement: Create a Person class with name and age. Create an Employee class that inherits from Person and adds employee ID and salary. Create a Manager class that inherits from Employee and adds a department name. Display all details.
//Sample Output:
//Name: Priya
//Age: 30
//Employee ID: 201
//Salary: 50000
//Department: IT
package oct21;


public class Multilevel_Inherits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager karthi=new Manager();
		karthi.display();

	}

}

class Person{
	String name="Priya";
	int age=20;
}
class Employee extends Person{
	int emp_id=201;
	int salary=50000;
}
class Manager extends Employee{
	String dept="IT";
	void display(){
		System.out.print("Name\t\t:"+name+"\nAge\t\t:"+age+"\nEmployee ID\t:"+emp_id+"\nSalary\t\t:"+salary+"\nDepartment\t:"+dept);
}
}



/* 
package oct21;

import java.util.Scanner;

public class Multilevel_Inherits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Manager karthi = new Manager();

        System.out.print("Enter Name: ");
        karthi.name = sc.nextLine();

        System.out.print("Enter Age: ");
        karthi.age = sc.nextInt();

        System.out.print("Enter Employee ID: ");
        karthi.emp_id = sc.nextInt();

        System.out.print("Enter Salary: ");
        karthi.salary = sc.nextDouble();

        sc.nextLine(); // Clear the newline

        System.out.print("Enter Department: ");
        karthi.dept = sc.nextLine();

        System.out.println("\n--- Employee Details ---");
        karthi.display();

        sc.close();
    }
}

class Person {
    String name;
    int age;
}

class Employee extends Person {
    int emp_id;
    double salary;
}

class Manager extends Employee {
    String dept;

    void display() {
        System.out.println("Name\t\t: " + name);
        System.out.println("Age\t\t: " + age);
        System.out.println("Employee ID\t: " + emp_id);
        System.out.println("Salary\t\t: " + salary);
        System.out.println("Department\t: " + dept);
    }
}


 */