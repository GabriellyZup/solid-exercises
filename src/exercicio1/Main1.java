package exercicio1;

public class Main1 {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();
        EmailSender emailSender = new EmailSender();

        reportGenerator.generateReport();
        emailSender.sendByEmail();
    }
}
