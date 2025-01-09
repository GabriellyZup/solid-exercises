package o.exercicio.bonus.core;

import o.exercicio.bonus.services.*;
import o.exercicio.bonus.accounts.*;
import o.exercicio.bonus.notifications.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankManagementSystem {
    private Notification notification;
    private List<Client> clients;

    public BankManagementSystem (Notification notification){
        this.notification = notification;
        this.clients = new ArrayList<>();
    }

    public void registerClient(String name, String email, String cpf, String phone, String accountType) {
        String accountNumber = generateAccountNumber();
        Client client = new Client(name, email, cpf, phone, accountNumber, accountType);

        TaxCalculator taxCalculator = accountType.equals("Corrente")
                ? new CheckingAccountTaxCalculator()
                : new SavingsAccountTaxCalculator();
        double tax = taxCalculator.calculateTax(1000); // Exemplo de cálculo com base em R$1000
        System.out.println("Taxa para " + accountType + ": R$ " + tax);



        clients.add(client);
        System.out.println("Cadastro concluído com sucesso! Número da conta: " + accountNumber);
    }

    public Client login(String identifier) {
        Optional<Client> client = clients.stream()
                .filter(c -> c.getCpf().equals(identifier) || c.getAccountNumber().equals(identifier))
                .findFirst();

        if (client.isPresent()) {
            System.out.println("Bem-vindo, " + client.get().getName() + "!");
            return client.get();
        } else {
            System.out.println("Dados incorretos, tente novamente.");
            return null;
        }
    }

    public void processTransaction(Client client, Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount);
            notification.send("Depósito de R$ " + amount + " realizado com sucesso para " + client.getName() + ".");
        } else {
            account.withdraw(amount);
            notification.send("Saque de R$ " + amount + " realizado com sucesso para " + client.getName() + ".");
        }
    }

    private String generateAccountNumber() {
        return String.valueOf((int) (Math.random() * 90000) + 10000); // Gera um número de 5 dígitos
    }
}
