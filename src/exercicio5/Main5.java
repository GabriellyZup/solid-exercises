package exercicio5;

import java.util.Scanner;

public class Main5 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um dipositivo de entrada: ");
        System.out.println("1 - Teclado");
        System.out.println("2 - Mouse");

        int choice = scanner.nextInt();
        InputDevice device;

        if (choice == 1) {
            device = new Keyboard();
        } else if (choice == 2) {
            device = new Mouse();
        } else {
            System.out.println("Opção invalida. Encerrando o programa.");
            scanner.close();
            return;
        }

        Computer computer = new Computer (device);
        System.out.println("Dispositivo de entrada utilizado: ");
        computer.useInputDevice();

        scanner.close();

    }
}
