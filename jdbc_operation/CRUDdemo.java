package jdbc_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// Step 1: Import JDBC package
	        // Step 2: Load Driver
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        // Step 3: Establish Connection
	        Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/FacePrep",
	            "root",
	            "Karthi@123"
	        );

	        // Step 4: Create Statement
	        Statement stmt = con.createStatement();
	        Scanner sc = new Scanner(System.in);
	        
	        //Insert
	        int empid=sc.nextInt();
	        String empname=sc.next();
	        int empage=sc.nextInt();
	        
	        String sql = "INSERT INTO emp VALUES ("+empid+", '"+empname+"', "+empage+")";
	        stmt.executeUpdate(sql);
	            
	        System.out.println("Records inserted successfully");
	        
	        /*String sql = "INSERT INTO emp VALUES (?, ?, ?)";

	        PreparedStatement ps = con.prepareStatement(sql);

	        ps.setInt(1, empId);
	        ps.setString(2, empName);
	        ps.setInt(3, empAge);

	        ps.executeUpdate();*/
	        
	        //Update
	        
	        System.out.print("Enter Employee ID: ");
	        empid = sc.nextInt();

	        System.out.print("Enter New Employee Name: ");
	        empname = sc.next();

	        System.out.print("Enter New Employee Age: ");
	        empage = sc.nextInt();

	        sql = "UPDATE emp SET name='"+empname+"', age="+empage+" WHERE id="+empid;

	        int result = stmt.executeUpdate(sql);

	        if (result > 0) {
	            System.out.println("Record updated successfully");
	        } else {
	            System.out.println("Employee ID not found");
	        }
	        
	        //Delete
	        
	        System.out.print("Enter Student ID to delete: ");
	        int id = sc.nextInt();

	        sql = "DELETE FROM emp WHERE id = " + id;

	        result = stmt.executeUpdate(sql);

	        if (result > 0) {
	            System.out.println("Record deleted successfully");
	        } else {
	            System.out.println("Student ID not found");
	        }
	        
	        
	} catch (Exception e) {
        System.out.println("sorry for inconvients. check your connections."+e);
    }

}
}