//Problem Statement: Write a Java program to accept a number and display a message if the number is positive.
package task;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(num>0)
		System.out.println("Positive");

	}

}
