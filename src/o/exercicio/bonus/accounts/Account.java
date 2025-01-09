package o.exercicio.bonus.accounts;

public interface Account {
    void deposit (double amount);
    void withdraw (double amount);
    double getBalance();

    public class CheckingAccount implements Account {
        private double balance;

        public void deposit (double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }
    }
}
