package o.exercicio.bonus.services;

public class SavingsAccountTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double amount) {
        // Taxa fixa de 0.5% para contas poupança
        return amount * 0.005;
    }
}