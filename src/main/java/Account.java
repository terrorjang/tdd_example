public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public Account(int money) {
        this.balance = money;
    }

    public void deposit(int money) {
        balance -= money;

    }

    public void withdraw(int money) {
        balance += money;

    }
}
