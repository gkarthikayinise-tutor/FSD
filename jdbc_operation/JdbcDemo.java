/*
 * 1.Register
 * 2.Connection
 * 3.Statement
 * 4.print
 * 5.close*/
package jdbc_operation;

import java.sql.*;
import java.util.Scanner;

public class JdbcDemo {

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

        // Step 5: Write CREATE query
        // Step 6: Execute Query
        
        //create
        
        stmt.executeUpdate( "CREATE TABLE emp (id INT PRIMARY KEY,name VARCHAR(50),age INT)");
        System.out.println("Table created successfully!");
        
        // insert
       
        stmt.executeUpdate("INSERT INTO emp VALUES (1, 'Avanthika', 25)");
        stmt.executeUpdate("INSERT INTO emp VALUES (2, 'Mirthika', 23)");
        stmt.executeUpdate("INSERT INTO emp VALUES (3, 'Karthick', 28)");

        System.out.println("Records inserted successfully");
        
        // UPDATE
        stmt.executeUpdate(
            "UPDATE emp SET name='Priya', age=26 WHERE id=1"
        );
        System.out.println("Record updated successfully");

        // DELETE
        stmt.executeUpdate(
            "DELETE FROM emp WHERE id=3"
        );
        System.out.println("Record Delete successfully");
        
        // Display
        
        ResultSet rs =stmt.executeQuery("select * from emp");
        
        while (rs.next()) {

            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");

            System.out.println(id + " " + name + " " + age);
        }

        rs.close();
        // Step 7: Close Connection
        stmt.close();
        con.close();

    } catch (Exception e) {
        System.out.println("sorry for inconvenients. check your connections.");
    }
	}

}
