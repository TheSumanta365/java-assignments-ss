public class BankAccount {
    // Data members
    private static int nextAccountNumber = 1000;  // Initial account number
    private int accountNumber;
    private String name;
    private String address;
    private String accountType;
    private double balance;
    private int numTransactions;

    // Constructor
    public BankAccount(String name, String address, String accountType, double balance) {
        this.accountNumber = generateAccountNumber();
        this.name = name;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
        this.numTransactions = 0;
    }

    // Method to generate a unique account number
    private static int generateAccountNumber() {
        return nextAccountNumber++;
    }

    // Method to display information and balance of depositor
    public void displayInfo() {
        System.out.println("Account Number: BA" + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
        System.out.println("Number of Transactions: " + numTransactions);
    }

    // Method to deposit more amount in the balance
    public void deposit(double amount) {
        balance += amount;
        numTransactions++;
    }

    // Method to withdraw some amount from the balance
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            numTransactions++;
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // Method to change address of depositor
    public void changeAddress(String newAddress) {
        address = newAddress;
        numTransactions++;
    }

    // Getter method for the number of transactions
    public int getNumTransactions() {
        return numTransactions;
    }
}
