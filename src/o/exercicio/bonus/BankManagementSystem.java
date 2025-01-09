package o.exercicio.bonus;
import o.exercicio.bonus.accounts.*;
import o.exercicio.bonus.notifications.*;
import o.exercicio.bonus.services.*;

public class BankManagementSystem {
    private Notification notification;

    public BankManagementSystem (Notification notification){
        this.notification = notification;
    }

    public void processTransaction(Account account, double amount, boolean isDeposit) {
        if  (isDeposit){
            account.deposit(amount);
            notification.send("Deposito de R$ " + amount + " realizado com sucesso.");
        }else {
            account.withdraw(amount);
            notification.send("Saque de R$ " + amount + " realizado com sucesso.");
        }
    }
}
