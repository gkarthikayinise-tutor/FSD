package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Student{
	int stu_id;
	String stu_name;
	String dept;
	int marks;
	
	Student(int stu_id,	String stu_name,	String dept,	int marks){
		this.stu_id=stu_id;
		this.stu_name=stu_name;
		this.dept=dept;
		this.marks=marks;
	}
	
	void display(){
		System.out.println("Student Id\t:\t"+stu_id+"\nStudent Name\t:\t"+stu_name+"\nDepartment\t:\t"+dept+"\nMarks\t\t:\t"+marks);
	}
}
public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// to store the student data
		ArrayList<Student> students = new ArrayList<>();

        // to prevent duplicate Student IDs
        HashSet<Integer> studentIds = new HashSet<>();

		//System.out.println("Enter the no of Students:");
		//int n=sc.nextInt();
        int n=5;
		for(int i=0;i<n;i++){
			int stu_id=sc.nextInt();
			String stu_name=sc.next();
			String dept=sc.next();
			int marks=sc.nextInt();
			addStudent(students,studentIds,new Student(stu_id,stu_name,dept,marks));
		}
		
		//Display the student
		System.out.println("\n===== ALL STUDENT DETAILS =====");

        Iterator<Student> itr = students.iterator();

        while (itr.hasNext()) {
            Student s = itr.next();
            s.display();
        }
        
        //Search the Student
        System.out.print("\nEnter Student ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Student s : students) {
            if (s.stu_id == searchId) {
                System.out.println("\nStudent Found!");
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
        
        //Remove the student
        System.out.print("\nEnter Student ID to delete: ");
        int deleteId = sc.nextInt();

        boolean deleted = false;

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student s = iterator.next();

            if (s.stu_id == deleteId) {
                iterator.remove();
                studentIds.remove(deleteId);
                deleted = true;
                System.out.println("Student deleted successfully!");
                break;
            }
        }

        if (!deleted) {
            System.out.println("Student ID not found!");
        }		
	}
	static void addStudent(ArrayList<Student> students, HashSet<Integer> studentIds,  Student student) {

		if (studentIds.add(student.stu_id)) {
		 students.add(student);
		} else {
		 System.out.println(
		     "Duplicate Student ID: " + student.stu_id
		 );
		}

}
}
