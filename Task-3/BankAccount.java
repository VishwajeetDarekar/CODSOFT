public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void checkBalance() {
        System.out.printf("Current Balance: ₹%.2f\n", balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: ₹%.2f\n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.printf("Withdrawn: ₹%.2f\n", amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
