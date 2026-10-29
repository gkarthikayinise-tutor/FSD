package Exceptiondemo;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//code that may raise exception
			int data=100/0;
			
			}catch(ArithmeticException e){System.out.println(e);}
			//rest code of the program
			System.out.println("rest of the code...");
	try{
		String s=null;
		System.out.println(s.length());
	}catch(NullPointerException e){
		System.out.println(e);
	}
	
	try{
		String s="abc";
		int i=Integer.parseInt(s);//NumberFormatException

	}catch(NumberFormatException e){
		System.out.println(e);
	}
	

	try{
		int a[]=new int[5];
		a[10]=50; //ArrayIndexOutOfBoundsException

	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
	//finally block run always.Sometime catch block have logical error that time also finally block run but not run the rest of code
	finally{
		System.out.println("Thanks");
	}
	}
}
