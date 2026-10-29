package Exceptiondemo;

public class Demothrow {

	public void validate(int age){
		if(age<18){
			throw new ArithmeticException("You are not valid");
		}
		else{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demothrow a =new Demothrow();
		a.validate(15);
	}

}
