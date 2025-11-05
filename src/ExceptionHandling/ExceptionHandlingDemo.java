package ExceptionHandling;

import java.io.*;
import java.util.*;

/**
 * Demonstrates various exception handling techniques in Java including:
 * - Custom exceptions
 * - Try-with-resources
 * - Multiple catch blocks
 * - Finally blocks
 * - Exception chaining
 * - Resource management
 */
public class ExceptionHandlingDemo {
    // Custom checked exception
    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    // Custom runtime exception
    static class InvalidAccountException extends RuntimeException {
        public InvalidAccountException(String message) {
            super(message);
        }
    }

    // Bank account class to demonstrate exception handling
    static class BankAccount {
        private String accountId;
        private double balance;
        private boolean isClosed;

        public BankAccount(String accountId, double initialBalance) {
            this.accountId = accountId;
            this.balance = initialBalance;
            this.isClosed = false;
        }

        public void withdraw(double amount) throws InsufficientBalanceException {
            // Demonstrate multiple validation checks
            if (isClosed) {
                throw new InvalidAccountException("Account " + accountId + " is closed");
            }

            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(
                    String.format("Insufficient funds: needed %.2f, available %.2f", 
                                amount, balance));
            }

            balance -= amount;
        }

        public void deposit(double amount) {
            if (isClosed) {
                throw new InvalidAccountException("Cannot deposit to closed account");
            }
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
            balance += amount;
        }

        public void close() {
            isClosed = true;
        }

        public double getBalance() {
            return balance;
        }
    }

    // Demonstrate resource handling with AutoCloseable
    static class TransactionLogger implements AutoCloseable {
        private String logFile;
        private boolean isOpen;

        public TransactionLogger(String logFile) {
            this.logFile = logFile;
            this.isOpen = true;
            System.out.println("Opening transaction log: " + logFile);
        }

        public void logTransaction(String message) {
            if (!isOpen) {
                throw new IllegalStateException("Logger is closed");
            }
            System.out.println("Logging: " + message);
        }

        @Override
        public void close() {
            System.out.println("Closing transaction log: " + logFile);
            isOpen = false;
        }
    }

    public static void main(String[] args) {
        // 1. Basic try-catch with custom exception
        BankAccount account = new BankAccount("123", 1000.0);
        try {
            System.out.println("Attempting to withdraw $1500...");
            account.withdraw(1500.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 2. Multiple catch blocks
        try {
            account.withdraw(-100.0);  // Should throw IllegalArgumentException
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient funds: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount: " + e.getMessage());
        }

        // 3. Try-with-resources for automatic resource management
        try (TransactionLogger logger = new TransactionLogger("transactions.log")) {
            account.deposit(500.0);
            logger.logTransaction("Deposited $500.0");
            System.out.println("New balance: $" + account.getBalance());
        } catch (Exception e) {
            System.out.println("Error during transaction: " + e.getMessage());
        }

        // 4. Exception chaining and finally block
        try {
            account.close();
            try {
                account.deposit(100.0);  // Should throw InvalidAccountException
            } catch (InvalidAccountException e) {
                // Chain a new exception with the original as the cause
                throw new IllegalStateException("Transaction failed", e);
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause().getMessage());
        } finally {
            System.out.println("Final account balance: $" + account.getBalance());
        }

        // 5. Handle multiple exceptions in one catch block (Java 7+ feature)
        List<BankAccount> accounts = new ArrayList<>();
        try {
            accounts.get(0).deposit(100.0);  // Should throw IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Error accessing account: " + e.getClass().getSimpleName());
        }

        // 6. Demonstrate try-with-resources with multiple resources
        try (TransactionLogger logger1 = new TransactionLogger("primary.log");
             TransactionLogger logger2 = new TransactionLogger("backup.log")) {
            
            logger1.logTransaction("Starting backup");
            logger2.logTransaction("Backup in progress");
            throw new IOException("Simulated IO error");
            
        } catch (Exception e) {
            System.out.println("Error during backup: " + e.getMessage());
        }
    }
}