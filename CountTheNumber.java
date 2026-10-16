//Problem Statement: Write a Java program to count the number of digits in a positive integer using a for loop.
//Sample Output:
//Enter a number: 12345
//Number of digits: 5
package task;

import java.util.Scanner;

public class CountTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (; num > 0; num = num / 10) {
            count++;
        }

        System.out.println("Number of digits: " + count);

	}

}
