package oops;

public class Class123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son kavi=new Son();
		kavi.bike();
		//kavi.car();
		//kavi.cycle();
		System.out.println(kavi.sbi);
		
		Calculator c=new Calculator();
		c.addition(4, 5);

	}

}

//Polymorphism
class Calculator{
	//method overloading, JVM only understand the method choose
	void addition(int no1,int no2){
		System.out.print("Result for 1st method:"+(no1+no2));
		
	}
	void addition(int no1,int no2,int no3){
		System.out.print("Result for 2 nd method:"+(no1+no2+no3));
		
	}
	void addition(int no1,double no2,int no3){
		System.out.print("Result for 2 nd method:"+(no1+no2+no3));
		
	}
}
class GrandFather{
	int sbi=10000000;
	void bike(){
		System.out.println("Honda bike by GrandFather");
	}
}
class Father extends GrandFather{
	int sbi=100000;
	
	//method overriding
	void bike(){
		System.out.println("Honda bike by Father");
		super.bike();
		System.out.println(super.sbi);
	}
	
	void car(){
		System.out.println("Maruthi car by Father");
	}
}


class Son extends Father{
	int sbi=1000;
	
	void cycle(){
		System.out.println("cycle from son's class");
	}
	void bike(){
		System.out.println("bike from Son's class");
		super.bike();
		System.out.println(super.sbi);
	}
	
}

//class Son1 extends Father{
	//int hdfc=100;
	
	//void newcycle(){
		//System.out.println("newcycle from son's class");
	//}
	
//}