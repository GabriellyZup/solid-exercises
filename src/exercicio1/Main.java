package exercicio1;

public class Main {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();
        EmailSender emailSender = new EmailSender();

        reportGenerator.generateReport();
        emailSender.sendByEmail();
    }
}
