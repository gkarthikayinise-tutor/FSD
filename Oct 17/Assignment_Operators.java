package Day2;

public class Assignment_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank rbi=new Bank();
		System.out.println("Initial Balance:"+rbi.balance);
		rbi.deposit();
		rbi.withdraw();

	}

}

class Bank{
	int balance=5000;
	void deposit(){
		System.out.println("After Deposit"+(balance+=1500));
	}
	void withdraw(){
		System.out.println("After Withdraw:"+(balance-=1000));
	}
}
