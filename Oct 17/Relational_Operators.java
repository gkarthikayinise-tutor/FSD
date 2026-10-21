package Day2;

import java.util.Scanner;

public class Relational_Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println(num1+">"+num2+":"+(num1>num2));
        System.out.println(num1+"<"+num2+":"+(num1<num2));
        System.out.println(num1+"=="+num2+":"+(num1==num2));
        System.out.println(num1+"!="+num2+":"+(num1!=num2));

	}

}
