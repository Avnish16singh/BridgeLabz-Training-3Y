package ClassesAndObjects.Level2;
// BankAccount class
class BankAccount {
    // Attributes
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class ATMSimulation {
    public static void main(String[] args) {
        // Create a bank account object
        BankAccount account1 = new BankAccount("Alice", "ACC12345", 10000.0);

        // Perform operations
        account1.displayBalance();
        System.out.println();

        account1.deposit(2500);
        account1.displayBalance();
        System.out.println();

        account1.withdraw(4000);
        account1.displayBalance();
        System.out.println();

        account1.withdraw(12000); // Attempt to withdraw more than balance
        account1.displayBalance();
    }
}
