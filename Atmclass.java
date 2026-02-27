class ATM {
    private double balance;

    // Constructor
    ATM(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

public class Atmclass {
    public static void main(String[] args) {

        ATM atm = new ATM(5000);

        System.out.println("Current Balance: " + atm.getBalance());

        atm.withdraw(2000);
        System.out.println("Balance after withdrawal: " + atm.getBalance());

        atm.withdraw(4000);   // insufficient balance
        System.out.println("Final Balance: " + atm.getBalance());
    }
}