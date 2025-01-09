package o.exercicio.bonus;

import o.exercicio.bonus.accounts.*;
import o.exercicio.bonus.notifications.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Notification notification = new EmailNotification();
        o.exercicio.bonus.BankManagementSystem system = new o.exercicio.bonus.BankManagementSystem(notification);

        System.out.println("Bem vindo ao banco!");
        System.out.println("Escolha o tipo de conta: 1 - Conta Corrente, 2 - Conta Poupança");
        int accountType = scanner.nextInt();

        Account account = accountType == 1 ? new Account.CheckingAccount() : new SavingsAccount();

        System.out.println("Digite o valor depositado: $");
        double depositAmout = scanner.nextDouble();
        system.processTransaction(account, depositAmout, true);

        System.out.println("Digite o valor para sacar: $");
        double withdrawAmount = scanner.nextDouble();
        system.processTransaction(account, withdrawAmount, false);

        System.out.println("Saldo atualizado: $" +account.getBalance());


    }
}
