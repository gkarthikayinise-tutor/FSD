//Task 8: Bank Account Types
//Problem Statement: Create a BankAccount class with account number and balance. Create two child classes, 
//SavingsAccount and CurrentAccount, that inherit from BankAccount. Each child class should display its 
//account type along with the inherited details.
//Sample Output:
//Savings Account
//Account Number: 1001
//Balance: 25000

//Current Account
//Account Number: 1002
//Balance: 50000
package oct21;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		SavingsAccount sa=new SavingsAccount();
		System.out.print("Enter the Account number:");
		sa.acc_no=sc.nextInt();
		System.out.print("Enter the Balance:");
		sa.bal=sc.nextInt();
		sa.savedisplay();
		
		CurrentAccount ca=new CurrentAccount();
		System.out.print("Enter the Account number:");
		ca.acc_no=sc.nextInt();
		System.out.print("Enter the Balance:");
		ca.bal=sc.nextInt();
		ca.currentdisplay();

	}

}

class BankAccount{
	int acc_no;
	int bal;
}

class SavingsAccount extends BankAccount{
	void savedisplay(){
		System.out.println("Account Number:"+this.acc_no);
		System.out.println("Balance:"+this.bal);
	}
}

class CurrentAccount extends BankAccount{
	void currentdisplay(){
		System.out.println("Account Number:"+this.acc_no);
		System.out.println("Balance:"+this.bal);
	}
}