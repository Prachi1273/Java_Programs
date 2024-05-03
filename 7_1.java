public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". Current balance is " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Current balance is " + balance);
        } else {
            System.out.println("Insufficient balance. Current balance is " + balance);
        }
    }

    public void getBalance() {
        System.out.println("Current balance is " + balance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank(1000.0);
        bank.deposit(500.0);
        bank.withdraw(200.0);
        bank.getBalance();
    }
}

