package Exceptiondemo;

public class Throws1 {

	public int division(int a, int b) throws ArithmeticException{
	      int t = a/b;
	      return t;
	   }
	   public static void main(String args[]){
	      Throws1 obj = new Throws1();
	      try{
	         System.out.println(obj.division(15,0));
	      }
	      catch(ArithmeticException e){
	         System.out.println("You shouldn't divide number by zero");
	      }
	   }


}
