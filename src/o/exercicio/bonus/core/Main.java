package o.exercicio.bonus.core;

import o.exercicio.bonus.accounts.*;
import o.exercicio.bonus.notifications.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Notification notification = new EmailNotification();
        BankManagementSystem system = new BankManagementSystem(notification);

        while (true) {
        System.out.println("Bem vindo ao banco!");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Entrar");
        System.out.println("3 - Sair ");
        int option = scanner.nextInt();
        scanner.nextLine();

            if (option == 1) {
                System.out.println("Digite seu nome:");
                String name = scanner.nextLine();

                System.out.println("Digite seu e-mail:");
                String email = scanner.nextLine();
                if (!validateEmail(email)) continue;

                System.out.println("Digite seu CPF (somente números):");
                String cpf = scanner.nextLine();
                if (!validateCPF(cpf)) continue;

                System.out.println("Digite seu telefone (somente números):");
                String phone = scanner.nextLine();
                if (!validatePhone(phone)) continue;

                try {
                    System.out.println("Dados validados com sucesso!");
                    System.out.println("Escolha o tipo de conta: 1 - Corrente, 2 - Poupança");
                    String accountType = scanner.nextInt() == 1 ? "Corrente" : "Poupança";
                    scanner.nextLine();

                    system.registerClient(name, email, cpf, phone, accountType);
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro no cadastro: " + e.getMessage());
                }
            } else if (option == 2) {
                System.out.println("Digite seu CPF ou número da conta:");
                String identifier = scanner.nextLine();
                Client client = system.login(identifier);

                if (client != null) {
                    System.out.println("Escolha o tipo de notificação: 1 - E-mail, 2 - SMS");
                    int notificationType = scanner.nextInt();
                    scanner.nextLine();
                    system = new BankManagementSystem(notificationType == 1 ? new EmailNotification() : new SMSNotification());

                    System.out.println("1 - Depositar");
                    System.out.println("2 - Sacar");
                    int transactionOption = scanner.nextInt();
                    System.out.println("Digite o valor:");
                    double amount = scanner.nextDouble();

                    Account account = client.getAccountType().equals("Corrente") ? new CheckingAccount() : new SavingsAccount();
                    system.processTransaction(client, account, amount, transactionOption == 1);
                }
            } else if (option == 3) {
                System.out.println("Obrigado por usar o banco!");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    private static boolean validateEmail(String email) {
        if (!email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.println("E-mail inválido.");
            return false;
        }
        return true; // passou
    }

    private static boolean validateCPF(String cpf) {
        if (!cpf.matches("\\d{11}")) {
            System.out.println("CPF deve conter 11 dígitos.");
            return false;
        }
        // Verifica se todos os dígitos são iguais (exemplo: 111.111.111-11 é inválido)
        if (cpf.chars().distinct().count() == 1) {
            System.out.println("CPF inválido");
            return false;
        }

        // Cálculo do primeiro dígito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int firstVerifier = 11 - (sum % 11);
        if (firstVerifier >= 10) {
            firstVerifier = 0;
        }

        // Verifica se o primeiro dígito verificador está correto
        if (firstVerifier != Character.getNumericValue(cpf.charAt(9))) {
            System.out.println("CPF inválido");
            return false;
        }

        // Cálculo do segundo dígito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int secondVerifier = 11 - (sum % 11);
        if (secondVerifier >= 10) {
            secondVerifier = 0;
        }

        // Verifica se o segundo dígito verificador está correto
        if (secondVerifier != Character.getNumericValue(cpf.charAt(10))) {
            System.out.println("CPF inválido");
            return false;
        }

        // CPF válido
        return true;
    }

    private static boolean validatePhone(String phone) {
        if (!phone.matches("\\d{11}")) {
            System.out.println("Telefone deve conter 11 dígitos.");
            return false;
        }
        return true;
    }

}


