package fundametal;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the first value ");
		int n1=sc.nextInt();
		System.out.print("enter the secound value " );
		int n2=sc.nextInt();
		operation ob=new operation();
		ob.add(n1,n2);


		int ans2=ob.sub(n1, n2);
		System.out.println("sub "+ans2 );
		int ans3=ob.mul(n1, n2);
		System.out.println("mul "+ans3 );
		int ans4=ob.div(n1, n2);
		System.out.println("div "+ans4 );
		int ans5=ob.mod(n1, n2);
		System.out.println("mod "+ans5 );









		}


		}
		class operation{
		public void  add(int n1,int n2){

		System.out.println( "Add "+(n1+n2));


		}
		public int  sub(int n1,int n2){
		return n1-n2;


		}
		public int  mul(int n1,int n2){
		return n1*n2;


		}
		public int  div(int n1,int n2){
		return n1/n2;


		}
		public int  mod(int n1,int n2){
		return n1%n2;


		}
}
