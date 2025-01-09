package o.exercicio.bonus.core;

public class Client {
    private String name;
    private String email;
    private String cpf;
    private String phone;
    private String accountNumber;
    private String accountType;

    public Client(String name, String email, String cpf, String phone, String accountNumber, String accountType) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Nome não pode estar vazio.");
        if (!email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) throw new IllegalArgumentException("E-mail inválido.");
        if (!cpf.matches("\\d{11}")) throw new IllegalArgumentException("CPF deve conter 11 dígitos.");
        if (!phone.matches("\\d{11}")) throw new IllegalArgumentException("Telefone deve conter 11 dígitos.");

        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = formatPhone(phone);
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    private String formatPhone(String phone) {
        return String.format("(%s) %s-%s", phone.substring(0, 2), phone.substring(2, 7), phone.substring(7));
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhone() {
        return phone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }
}
