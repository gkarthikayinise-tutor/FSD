package Day2;
import java.util.Scanner;
public class Arithmetic_Operator {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        int num1 = sc.nextInt();

		        System.out.print("Enter second number: ");
		        int num2 = sc.nextInt();

		        System.out.println("\nSum: " + (num1 + num2));
		        System.out.println("Difference: " + (num1 - num2));
		        System.out.println("Product: " + (num1 * num2));

		        if (num2 != 0) {
		            System.out.println("Quotient: " + (num1 / num2));
		            System.out.println("Remainder: " + (num1 % num2));
		        } else {
		            System.out.println("Division by zero is not possible.");
		        }

		    }

}
