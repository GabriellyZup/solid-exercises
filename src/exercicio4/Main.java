package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        GenericEmployee alice = new GenericEmployee("Alice", 1);
        GenericEmployee bob = new GenericEmployee("Bob", 2);

        Programmers aliceProgrammer = new ProgrammerFunctionality();
        Attendants aliceAttendant = new AttendantFunctionality();

        Attendants bobAttendant = new AttendantFunctionality();

        employees.add(alice);
        employees.add(bob);

        for (Employee employee : employees){
            System.out.println("Funcionário: " + employee.getName() + " (ID: " + employee.getId() + ")");

            if (employee.getName().equals("Alice")){
                aliceAttendant.assistCustomer();
                aliceProgrammer.code();
            } else if (employee.getName().equals("Bob")) {
                bobAttendant.assistCustomer();
            }
        }
    }
}
