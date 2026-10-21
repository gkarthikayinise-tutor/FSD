package Day2;

import java.util.Scanner;

public class Logical_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Age: ");
        int age=sc.nextInt();

        System.out.print("Enter Student Mark: ");
        int mark = sc.nextInt();
        
        System.out.println("Eligible:"+(age>=18 && mark>=50));
        System.out.println("Eligible:"+(age>=18 || mark>=50));
        System.out.println("Eligible:"+!(age>=18));

	}

}
