import java.util.Scanner;

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of depositors: ");
        int numDepositors = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create an array of BankAccount objects
        BankAccount[] accounts = new BankAccount[numDepositors];

        // Input information for each depositor
        for (int i = 0; i < numDepositors; i++) {
            System.out.println("\nEnter information for Depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Account Type: ");
            String accountType = scanner.nextLine();

            System.out.print("Initial Balance: $");
            double balance = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character

            accounts[i] = new BankAccount(name, address, accountType, balance);
        }

        // Perform operations on the accounts
        for (BankAccount account : accounts) {
            account.displayInfo();

            // Add some amount to the account
            System.out.print("\nEnter the amount to deposit: $");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            // Display final information
            System.out.println("\nAfter deposit:");
            account.displayInfo();

            // Remove some amount from the account
            System.out.print("\nEnter the amount to withdraw: $");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);

            // Display final information
            System.out.println("\nAfter withdrawal:");
            account.displayInfo();

            // Change the address of the depositor
            System.out.print("\nEnter the new address: ");
            String newAddress = scanner.nextLine();
            account.changeAddress(newAddress);

            // Display final information
            System.out.println("\nAfter changing address:");
            account.displayInfo();

            System.out.println("\n------------------------");
        }

        // Print total number of transactions
        int totalTransactions = getTotalTransactions(accounts);
        System.out.println("\nTotal Number of Transactions: " + totalTransactions);

        scanner.close();
    }

    // Helper method to calculate total transactions across all accounts
    private static int getTotalTransactions(BankAccount[] accounts) {
        int totalTransactions = 0;
        for (BankAccount account : accounts) {
            totalTransactions += account.getNumTransactions();
        }
        return totalTransactions;
    }
}
