package o.exercicio.bonus.services;

public class CheckingAccountTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double amount) {
        // Taxa de 1% para contas correntes
        return amount * 0.01;
    }
}