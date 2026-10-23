/*
Task 1: Online Food Delivery System
Scenario: An online food delivery application supports multiple restaurants. 
Every restaurant follows a common ordering process, but each restaurant has its own menu and pricing.

Requirements:
1. Create an abstract class Restaurant.
2. Declare an abstract method displayMenu().
3. Declare an abstract method calculateBill().
4. Create child classes PizzaRestaurant and BurgerRestaurant.
5. Implement both methods differently in each child class.
6. Create objects of both child classes and display their menus and bills.*/

package oct23;
import java.util.Scanner;
public class Online_food_Delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int quantity,totalamount=0,ch;
		PizzaRestaurant PR=new PizzaRestaurant();
		do{
			PR.displayMenu();
			System.out.println("Enter the choice");
			ch=sc.nextInt();
			 if (ch >= 1 && ch <= 3) {
				 	System.out.println("Enter the quantity");
				 	quantity=sc.nextInt();
				 	int bill=PR.calculateBill(quantity,ch);
				 	totalamount+=bill;
			 }
			 else if (ch == 4) {
	                System.out.println("Exiting...");
	                System.out.println("Total amount:"+totalamount);
	         } else {
	                System.out.println("Invalid choice! Please try again.");
	            }
		}while(ch!=4);
		
		
		BurgerRestaurant BR=new BurgerRestaurant();
		totalamount=0;
		do{
			BR.displayMenu();
			System.out.println("Enter the choice");
			ch=sc.nextInt();
			 if (ch >= 1 && ch <= 3) {
				 	System.out.println("Enter the quantity");
				 	quantity=sc.nextInt();
				 	int bill=BR.calculateBill(quantity,ch);
				 	totalamount+=bill;
			 }
			 else if (ch == 4) {
	                System.out.println("Exiting...");
	                System.out.println("Total amount:"+totalamount);
	         } else {
	                System.out.println("Invalid choice! Please try again.");
	            }
		}while(ch!=4);
		
	}

}

abstract class Restaurant{
	abstract void displayMenu();
	abstract int calculateBill(int q,int ch);
}

class PizzaRestaurant extends Restaurant{
	public void displayMenu(){
		System.out.println("\n--- Pizza Restaurant Menu ---");
        System.out.println("1. Pizza - Rs.100");
        System.out.println("2. Donut - Rs.40");
        System.out.println("3. Garlic Bread - Rs.60");
        System.out.println("4. Exit");
	}
	public int calculateBill(int q,int ch){
		if(ch==1){
			return q*100;
		}
		else if(ch==2){
			return q*40;
		}
		else if(ch==3){
			return q*60;
		}
		else{
			return 0;
		}
	}
}


class BurgerRestaurant extends Restaurant{
	public void displayMenu(){
		System.out.println("\n--- Burger Restaurant Menu ---");
        System.out.println("1. Veg Burger - Rs.80");
        System.out.println("2. Cheese Burger - Rs.120");
        System.out.println("3. Chicken Burger - Rs.150");
        System.out.println("4. Exit");
	}
	public int calculateBill(int q,int ch){
		if(ch==1){
			return q*80;
		}
		else if(ch==2){
			return q*120;
		}
		else if(ch==3){
			return q*150;
		}
		else{
			return 0;
		}
	}
}