/*
 * 1.fields or data members or variable
 * 2. User defined methods
 * 3. Default con
 * 4. Parameter cont
 * 5.nested class
 * 6.initi block
 * 7.static block
 * 8. method local inner class
 * 
 * Inher- single,multi level,hie,multiple
 * poly method overloading, method overriding
 * 
 * constructor (Method)
 * constructor name as class name
 * con does't have a return types
 * while creating a obj we suppose call one construct of the class (def,para) */
package oops;

public class Construct_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Demo guru=new Demo();
		Demo gurusamy=new Demo(3);
		Demo g1=new Demo("Karthi");*/
		
		Demoson avanthi=new Demoson();
		Demoson mirthi=new Demoson(12);
		Demoson selvi=new Demoson("Ranjani");
		selvi.bike();

	}

}


class Demo{
	String name="Karthi";
	
	public void bike(){
		System.out.println("Father method");
	}
	
	Demo(){
		System.out.println("Default con");
	}
	
	Demo(int a){
		System.out.println("Para con"+a);
	}
	Demo(String name){
		System.out.println("Para con"+name);
	}
}


class Demoson extends Demo{
	Demoson(){
		super();
		System.out.println("Default son con");
	}
	
	Demoson(int a){
		super(a);
		System.out.println("Para son con"+a);
	}
	Demoson(String name){
		super(name);
		System.out.println("Para son con"+name);
	}
	public void bike(){
		super.bike();
		System.out.println("Son method");
	}
}