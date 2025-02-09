import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ATM {
    int accountNumber;
    int pin;
    double balance;

    public ATM(int accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
}

public class ATMInterface {
    private Map<Integer, ATM> accounts;
    private Scanner scanner;

    public ATMInterface() {
        accounts = new HashMap<>();
        scanner = new Scanner(System.in);
        
        // Corrected account initialization inside the constructor
        accounts.put(1234, new ATM(1234, 1111, 1000.0));
        accounts.put(5678, new ATM(5678, 2222, 500.0));
        accounts.put(1112, new ATM(1112, 3333, 5000.0));
        accounts.put(1213, new ATM(1213, 4444, 7000.0));


    }

    public void run() {
        while (true) {
            System.out.println("Welcome to ATM Interface");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    login();  // Fixed method name
                    break;
                case 2:
                    System.out.println("Thank you for using ATM Interface");
                    scanner.close(); // Closing scanner properly
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void login() {
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();
        
        ATM account = accounts.get(accountNumber); // Fixed reference
        
        if (account != null && account.pin == pin) {
            System.out.println("Login successful");
            accountMenu(account);
        } else {
            System.out.println("Invalid account number or PIN");
        }
    }

    private void accountMenu(ATM account) { // Fixed reference
        while (true) {
            System.out.println("\nAccount Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance(account);
                    break;
                case 2:
                    withdraw(account);
                    break;
                case 3:
                    deposit(account);
                    break;
                case 4:
                    System.out.println("Logout successful");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void checkBalance(ATM account) {
        System.out.println("Your current balance is: $" + account.balance);
    }

    private void withdraw(ATM account) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > account.balance) {
            System.out.println("Insufficient balance");
        } else {
            account.balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: $" + account.balance);
        }
    }

    private void deposit(ATM account) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        account.balance += amount;
        System.out.println("Deposit successful. Your new balance is: $" + account.balance);
    }

    public static void main(String[] args) {
        ATMInterface atm = new ATMInterface();
        atm.run();
    }
}
