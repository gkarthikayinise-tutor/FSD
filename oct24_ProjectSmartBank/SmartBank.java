package oops;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

abstract class BankAccount {
    private final String accountNumber;
    private final String customerName;
    private final String pin;
    private double balance;
    private final List<String> transactions;

    protected BankAccount(String accountNumber, String customerName,
                          String pin, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.pin = pin;
        this.balance = initialDeposit;
        this.transactions = new ArrayList<>();

        recordTransaction("Account Created", initialDeposit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountType() {
        return this instanceof SavingsAccount ? "Savings" : "Current";
    }

    public boolean authenticate(String enteredPin) {
        return pin.equals(enteredPin);
    }

    // Encapsulation: balance remains private.
    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected void recordTransaction(String type, double amount) {
        String time = LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

        transactions.add(String.format(
                "%-18s Amount: Rs. %.2f | Balance: Rs. %.2f | %s",
                type, amount, balance, time));
    }

    public List<String> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }

    public boolean deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return false;
        }

        setBalance(getBalance() + amount);
        recordTransaction("Deposit", amount);
        System.out.println("Deposit successful.");
        return true;
    }

    // Each account type defines its own withdrawal rules.
    public abstract boolean withdraw(double amount);

    protected boolean validAmount(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return false;
        }
        return true;
    }

    protected void completeWithdrawal(double amount) {
        setBalance(getBalance() - amount);
        recordTransaction("Withdrawal", amount);
        System.out.println("Withdrawal successful.");
    }

    public void displayBasicDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Account Type   : " + getAccountType());
    }

    public void displayBalance() {
        System.out.printf("Current Balance: Rs. %.2f%n", getBalance());
    }
}

class SavingsAccount extends BankAccount {
    public static final double MIN_BALANCE = 500.0;
    public static final double MIN_DEPOSIT = 500.0;

    public SavingsAccount(String number, String name,
                          String pin, double deposit) {
        super(number, name, pin, deposit);
    }

    @Override
    public boolean withdraw(double amount) {
        if (!validAmount(amount)) {
            return false;
        }

        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println(
                "Insufficient balance. Savings account must maintain Rs. 500.");
            return false;
        }

        completeWithdrawal(amount);
        return true;
    }
}

class CurrentAccount extends BankAccount {
    public static final double MIN_DEPOSIT = 1000.0;
    public static final double OVERDRAFT_LIMIT = 5000.0;

    public CurrentAccount(String number, String name,
                          String pin, double deposit) {
        super(number, name, pin, deposit);
    }

    @Override
    public boolean withdraw(double amount) {
        if (!validAmount(amount)) {
            return false;
        }

        if (getBalance() - amount < -OVERDRAFT_LIMIT) {
            System.out.println(
                "Withdrawal denied. Overdraft limit is Rs. 5000.");
            return false;
        }

        completeWithdrawal(amount);
        return true;
    }
}

public class SmartBank {
    private static final Scanner sc = new Scanner(System.in);
    private static final Map<String, BankAccount> accounts =
            new HashMap<>();

    private static long nextAccountNumber = 1000000001L;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n================================");
            System.out.println("       SMARTBANK");
            System.out.println("   Welcome to SmartBank");
            System.out.println("================================");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Money");
            System.out.println("6. View Transaction History");
            System.out.println("7. Display Account Details");
            System.out.println("8. Exit");

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1: createAccount(); break;
                case 2: depositMoney(); break;
                case 3: withdrawMoney(); break;
                case 4: checkBalance(); break;
                case 5: transferMoney(); break;
                case 6: viewHistory(); break;
                case 7: displayAccountDetails(); break;
                case 8:
                    System.out.println("Thank you for using SmartBank!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    private static double readAmount(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid amount.");
            }
        }
    }

    private static String readNonEmpty(String message) {
        while (true) {
            System.out.print(message);
            String value = sc.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("This field cannot be empty.");
        }
    }

    private static BankAccount findAccount(String number) {
        BankAccount account = accounts.get(number);

        if (account == null) {
            System.out.println("Account not found.");
        }

        return account;
    }

    private static boolean authenticateAccount(BankAccount account) {
        String pin = readNonEmpty("Enter your PIN: ");

        if (!account.authenticate(pin)) {
            System.out.println("Authentication failed. Invalid PIN.");
            return false;
        }

        return true;
    }

    // Module 1: Create Account
    private static void createAccount() {
        System.out.println("\n--- Create Account ---");

        String name = readNonEmpty("Enter customer name: ");

        if (!name.matches("[\\p{L} .'-]+")) {
            System.out.println("Invalid name. Use letters and spaces.");
            return;
        }

        System.out.println("1. Savings Account (minimum Rs. 500)");
        System.out.println("2. Current Account (minimum Rs. 1000)");

        int type = readInt("Select account type: ");

        if (type != 1 && type != 2) {
            System.out.println("Invalid account type.");
            return;
        }

        double minimum = type == 1
                ? SavingsAccount.MIN_DEPOSIT
                : CurrentAccount.MIN_DEPOSIT;

        double deposit = readAmount("Enter initial deposit: Rs. ");

        if (!Double.isFinite(deposit) || deposit < minimum) {
            System.out.printf(
                "Minimum initial deposit is Rs. %.2f%n", minimum);
            return;
        }

        String pin;
        while (true) {
            pin = readNonEmpty("Create a 4-digit PIN: ");
            if (pin.matches("\\d{4}")) {
                break;
            }
            System.out.println("PIN must contain exactly 4 digits.");
        }

        String number = String.valueOf(nextAccountNumber++);

        BankAccount account;

        if (type == 1) {
            account = new SavingsAccount(number, name, pin, deposit);
        } else {
            account = new CurrentAccount(number, name, pin, deposit);
        }

        accounts.put(number, account);

        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + number);
        System.out.println("Account Type  : " + account.getAccountType());
        System.out.printf("Initial Balance: Rs. %.2f%n", deposit);
    }

    // Module 2: Deposit
    private static void depositMoney() {
        System.out.println("\n--- Deposit Money ---");

        String number = readNonEmpty("Enter account number: ");
        BankAccount account = findAccount(number);

        if (account == null) {
            return;
        }

        double amount = readAmount("Enter deposit amount: Rs. ");
        account.deposit(amount);
    }

    // Module 3: Withdraw
    private static void withdrawMoney() {
        System.out.println("\n--- Withdraw Money ---");

        String number = readNonEmpty("Enter account number: ");
        BankAccount account = findAccount(number);

        if (account == null || !authenticateAccount(account)) {
            return;
        }

        double amount = readAmount("Enter withdrawal amount: Rs. ");
        account.withdraw(amount);
    }

    // Module 4: Check Balance
    private static void checkBalance() {
        System.out.println("\n--- Check Balance ---");

        String number = readNonEmpty("Enter account number: ");
        BankAccount account = findAccount(number);

        if (account == null || !authenticateAccount(account)) {
            return;
        }

        account.displayBasicDetails();
        account.displayBalance();
    }

    // Module 5: Transfer Money
    private static void transferMoney() {
        System.out.println("\n--- Fund Transfer ---");

        String senderNumber =
                readNonEmpty("Enter sender account number: ");
        BankAccount sender = findAccount(senderNumber);

        if (sender == null || !authenticateAccount(sender)) {
            return;
        }

        String receiverNumber =
                readNonEmpty("Enter receiver account number: ");

        if (senderNumber.equals(receiverNumber)) {
            System.out.println("Cannot transfer to the same account.");
            return;
        }

        BankAccount receiver = findAccount(receiverNumber);

        if (receiver == null) {
            return;
        }

        double amount = readAmount("Enter transfer amount: Rs. ");

        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Transfer amount must be greater than zero.");
            return;
        }

        // Validate withdrawal rules before changing either balance.
        double senderBalance = sender.getBalance();
        double receiverBalance = receiver.getBalance();

        if (sender instanceof SavingsAccount
                && senderBalance - amount < SavingsAccount.MIN_BALANCE) {
            System.out.println("Insufficient balance in sender account.");
            return;
        }

        if (sender instanceof CurrentAccount
                && senderBalance - amount < -CurrentAccount.OVERDRAFT_LIMIT) {
            System.out.println("Sender's overdraft limit exceeded.");
            return;
        }

        if (!Double.isFinite(receiverBalance + amount)) {
            System.out.println("Transfer amount is too large.");
            return;
        }

        // Complete both sides of the transfer.
        // Transfer history is recorded in both accounts.
        // Use the internal account operations for balance updates.
        if (!sender.withdraw(amount)) {
            return;
        }

        if (!receiver.deposit(amount)) {
            // This is an exceptional numeric failure; reverse the debit.
            sender.deposit(amount);
            System.out.println("Transfer failed. Sender amount restored.");
            return;
        }

        // Add explicit transfer records to both histories.
        // The debit and credit are already recorded above.
        System.out.println("Transfer successful!");
        System.out.println("From: " + senderNumber);
        System.out.println("To  : " + receiverNumber);
        System.out.printf("Amount: Rs. %.2f%n", amount);
    }

    // Module 6: Transaction History
    private static void viewHistory() {
        System.out.println("\n--- Transaction History ---");

        String number = readNonEmpty("Enter account number: ");
        BankAccount account = findAccount(number);

        if (account == null || !authenticateAccount(account)) {
            return;
        }

        List<String> history = account.getTransactions();

        if (history.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        account.displayBasicDetails();
        System.out.println("Transaction Records:");

        for (String transaction : history) {
            System.out.println(transaction);
        }
    }

    // Module 7: Account Information
    private static void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");

        String number = readNonEmpty("Enter account number: ");
        BankAccount account = findAccount(number);

        if (account == null) {
            return;
        }

        account.displayBasicDetails();

        System.out.print("Do you want to view the balance? (yes/no): ");
        String answer = sc.nextLine().trim();

        if (answer.equalsIgnoreCase("yes")) {
            if (authenticateAccount(account)) {
                account.displayBalance();
            }
        }
    }
}

