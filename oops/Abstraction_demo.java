package oops;

public class Abstraction_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class RBI{
	private final void deposit(){
		System.out.println("Deposit");
	}
	private final void withdraw(){
		System.out.println("Withdraw");
	}
	abstract void eduloan();
	abstract void agriloan();
}


class SBI extends RBI{
	void carloan(){
		System.out.println("ROI 11.25%");
	}
	void eduloan(){
		System.out.println("ROI 12.5%");
	}
	void agriloan(){
		System.out.println("ROI 11.5%");
	}
}