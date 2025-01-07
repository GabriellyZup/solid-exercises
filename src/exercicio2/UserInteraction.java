package exercicio2;

import java.util.Scanner;

public class UserInteraction {
    private final Scanner scanner = new Scanner(System.in);

//    private UserInteraction(){
//        this.scanner = new Scanner(System.in);
//    }

    public int getNumber(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public String getOperation() {
        System.out.println("Escolha uma operação (+, -, *, /): ");
        return scanner.next();
    }

    public void showResult(String message, double result){
        System.out.println(message + result);
    }

    public void showError(String message){
        System.out.println("Error: " + message);
    }

    public void closeScanner(){
        scanner.close();
    }
}
