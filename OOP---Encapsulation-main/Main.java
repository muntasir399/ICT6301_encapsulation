public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object for Muntasir with an initial deposit
        BankAccount account = new BankAccount("Muntasir", 1500);

        // Display initial account summary
        account.printAccountSummary();

        // Perform deposit and withdrawal operations
        account.deposit(1000);     // Valid deposit
        account.withdraw(500);     // Valid withdrawal
        account.withdraw(3000);    // Insufficient funds
        account.deposit(0);        // Invalid deposit
        account.withdraw(-100);    // Invalid withdrawal

        // Display updated account summary
        account.printAccountSummary();
    }
}
