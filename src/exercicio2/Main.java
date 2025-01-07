package exercicio2;

public class Main {

    public static void main (String[] args) {
        Calculator calculator = new Calculator ();
        UserInteraction userInteraction = new UserInteraction();

        try {
            int num1 = userInteraction.getNumber("Digite o primeiro número: ");
            int num2 = userInteraction.getNumber("Digite o segundo número: ");
            String operation = userInteraction.getOperation();

            double result;
            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    break;
                case"-":
                    result = calculator.subtract(num1, num2);
                    break;
                case"*":
                    result = calculator.multiply(num1, num2);
                    break;
                case"/":
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    userInteraction.showError("Operação inválida!");
                    return;
            }

                userInteraction.showResult("Resultado: ", result);

        }   catch (Exception e) {
             userInteraction.showError(e.getMessage());
        }   finally {
            userInteraction.closeScanner();
        }
    }
}


// Refactor: Apply OCP to improve code extensibility in exercise 2

