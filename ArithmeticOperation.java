//4. Problem Statement: Write a Java program to accept two numbers and an operator (+, -, *, /). Use a switch statement to perform the selected arithmetic operation.
package task;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number1");
		int num1=sc.nextInt();
		System.out.println("Enter your number1");
		int num2=sc.nextInt();
		System.out.println("Enter your choice:1.Add\n2.Subtract\n3.Multiply\n4.Division");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("Addition Result:"+(num1+num2));
			break;
		case 2:
			System.out.println("Subtraction Result:"+(num1-num2));
			break;
		case 3:
			System.out.println("Multiplication Result:"+(num1*num2));
			break;
		case 4:
			if(num2!=0){
				System.out.println("Division Result:"+((double)num1/num2));
			}else{
				System.out.println("Number 2 is zero. so cannot divide");
			}
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

	}

}
