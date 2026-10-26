package oct24_ProjectSmartBank;

public class SmartBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class BankAccount{
	private double account_balance;
	private long account_number;
	private int pin;
	private String customerName;
	
	BankAccount(long account_number,String customerName,int pin,double account_balance){
		this.account_number=account_number;
		this.customerName=customerName;
		this.pin=pin;
		this.account_balance=account_balance;
	}
	public long getAccount_number(){
		return account_number;
	}
	public String getCustomerName(){
		return customerName;
	}
	public double getAccount_balance(){
		return account_balance;
	}
	protected void setAccount_balance(double amount){
		account_balance+=amount;
	}
	public void deposit(double amount) {
        deposit(amount, "Cash deposit");
    }

    // Method overloading
    public void deposit(double amount, String description) {
        if (amount <= 0 || !Double.isFinite(amount)) {
            throw new IllegalArgumentException(
                "Amount must be positive.");
        }

        setAccount_balance(amount);
        addTransaction("DEPOSIT", amount, description);
    }
    protected void addTransaction(String type, double amount,
            String description) {}
    public void showHistory() {}
    
}

class SavingsAccount extends BankAccount{}

class CurrentAccount extends BankAccount{}