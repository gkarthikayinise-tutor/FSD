package oct23;

public class Bank_Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount(101, "Ravi", 10000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(2000);
        account.withdraw(3000);

        System.out.println("Available Balance: " + account.getBalance());

        account.withdraw(15000);

	}

}



class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Amount: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Amount: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

