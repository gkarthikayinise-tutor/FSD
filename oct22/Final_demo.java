package oops;

public class Final_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI sbi=new RBI();
		sbi.bike(); // normal method
		
		RBI.car(); // static method
		//sbi.asset(); final and private method
		sbi.assets(); // final method
		System.out.println("\nBalance:"+RBI.bal); //static variable 
		
		final String name="karthi";
		System.out.println("\nName:"+name);
		
		// name="selvi"; its not possible change it. final variable

	}

}

final class RBI{
	static int bal=3000;
	public void bike(){
		System.out.println("RBI bike method");
	}
	private final void asset(){
		System.out.println("1L rupees");
	}
	
	final void assets(){
		System.out.println("\n1C rupees");
	}
	static void car(){
		System.out.print("Car");
	}
}
