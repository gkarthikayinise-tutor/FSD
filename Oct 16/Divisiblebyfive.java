//3. Problem Statement: Write a Java program to accept a number and display a message if it is divisible by 5.
package task;

import java.util.Scanner;

public class Divisiblebyfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(num%5==0){
			System.out.println("divisible by 5");
		}
		else{
			System.out.println("not divisible by 5");
			
		}
			
	}

}
