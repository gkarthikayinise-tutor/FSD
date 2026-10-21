package oct21;

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Puppy p = new Puppy();

	        p.sound(10);
	        p.sound(10.5);
	        p.sound("Tommy");
		
	}

}

class Animal {
    void sound(double number) {
        System.out.println("Animal sound: " + number);
    }
}

class Dog extends Animal {
    void sound(int number) {
        System.out.println("Dog sound: " + number);
    }
}

class Puppy extends Dog {
    void sound(String name) {
        System.out.println("Puppy name: " + name);
    }
}
