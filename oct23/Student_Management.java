package oct23;

public class Student_Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();

        s.setStudentId(101);
        s.setStudentName("Karthi");
        s.setMarks(85);

        System.out.println("Student ID: " + s.getStudentId());
        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("Marks: " + s.getMarks());

        // Testing invalid marks
        s.setMarks(120);

	}

}



class Student {
    private int studentId;
    private String studentName;
    private int marks;

    // Setter and Getter for studentId
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    // Setter and Getter for studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    // Setter and Getter for marks with validation
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println(
                "Invalid marks! Enter marks between 0 and 100."
            );
        }
    }

    public int getMarks() {
        return marks;
    }
}


