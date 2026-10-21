package fundametal;
import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		int exp=30;
		byte no=4;
		short price=1000;
		long distance=30000000000000l;
		float discount=34.89f;
		double sun=3.4567;
		char name='k';
		boolean iseligible=true;
		
		Integer b=20;
		Integer b1=20;
		
		
		System.out.println(b.equals(b1));
		System.out.println(b.toString());
		System.out.println(distance);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println(age);

	}

}
