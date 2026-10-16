//2. Problem Statement: Write a Java program to accept a person's age and display "Eligible to Vote" if the age is 18 or above.
package task;

import java.util.Scanner;

public class EligibleVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println("Eligible to Vote");
		}
		else{
			System.out.println("not eligible to vote");
			
		}

	}

}
