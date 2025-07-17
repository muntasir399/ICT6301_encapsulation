/**
 * This class demonstrates encapsulation: private fields, controlled access
 * through public methods, and validation logic that protects the data.
 */
public class BankAccount {
    private String accountHolderName;
    private double balance;

    // Constructor with validation for initial deposit
    public BankAccount(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        if (initialDeposit > 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
            System.out.println("Initial deposit must be positive. Setting balance to 0.");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    public void printAccountSummary() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
}
