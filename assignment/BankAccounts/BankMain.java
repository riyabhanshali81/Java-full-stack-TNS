package assignment.BankAccounts;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Bank class 
class Bank {
    // Static variable 
    private static int totalAccounts = 0;

    // Constructor increments the total account count when a new account is created
    public Bank() {
        totalAccounts++;
    }

    // Static method 
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

// Abstract class Account with abstract methods
abstract class Account {
    protected double balance;

    // Constructor initializes the balance to zero
    public Account() {
        this.balance = 0.0;
    }

    // Abstract methods for deposit, withdraw, and getBalance
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
}

// Subclass SavingsAccount inheriting from Account
class SavingsAccount extends Account {
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Subclass CheckingAccount inheriting from Account
class CheckingAccount extends Account {
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Final class Transaction
final class Transaction {
    private final double transactionFee = 2.5; // Fixed transaction fee for every transaction

    // Final method 
    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }

    // Final method to get the transaction fee
    public final double getTransactionFee() {
        return transactionFee;
    }
}

// Main class 
public class BankMain {
    public static void main(String[] args) throws IOException {
        // BufferedReader to read user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Create bank accounts
        Account[] accounts = new Account[4];

        // Prompt user for input for Savings Account 1
        System.out.println("Enter details for Savings Account 1:");
        System.out.print("Deposit amount: ");
        double depositAmount1 = Double.parseDouble(br.readLine());

        // Create and deposit to Savings Account 1
        accounts[0] = new SavingsAccount();
        accounts[0].deposit(depositAmount1);

        // Prompt user for input for Checking Account 1
        System.out.println("Enter details for Checking Account 1:");
        System.out.print("Deposit amount: ");
        double depositAmount2 = Double.parseDouble(br.readLine());

        // Create and deposit to Checking Account 1
        accounts[1] = new CheckingAccount();
        accounts[1].deposit(depositAmount2);

        // Prompt user for input for Savings Account 2
        System.out.println("Enter details for Savings Account 2:");
        System.out.print("Deposit amount: ");
        double depositAmount3 = Double.parseDouble(br.readLine());

        // Create and deposit to Savings Account 2
        accounts[2] = new SavingsAccount();
        accounts[2].deposit(depositAmount3);

        // Prompt user for input for Checking Account 2
        System.out.println("Enter details for Checking Account 2:");
        System.out.print("Deposit amount: ");
        double depositAmount4 = Double.parseDouble(br.readLine());

        // Create and deposit to Checking Account 2
        accounts[3] = new CheckingAccount();
        accounts[3].deposit(depositAmount4);

        // Perform transactions
        Transaction transaction = new Transaction();
        transaction.performTransaction(accounts[0], 100, false); // Withdraw from Savings Account 1
        transaction.performTransaction(accounts[1], 200, false); // Withdraw from Checking Account 1
        transaction.performTransaction(accounts[2], 50, false); // Withdraw from Savings Account 2
        transaction.performTransaction(accounts[3], 100, false); // Withdraw from Checking Account 2

        System.out.println();
        // Print balance for each account
        for (Account account : accounts) {
            System.out.println("Balance: " + account.getBalance());
        }

        // Print total number of bank accounts
        System.out.println("Total bank accounts created: " + Bank.getTotalAccounts());

        // Print transaction fee
        System.out.println("Transaction fee: " + transaction.getTransactionFee());
    }
}
