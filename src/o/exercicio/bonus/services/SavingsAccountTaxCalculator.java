package o.exercicio.bonus.services;

public class SavingsAccountTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.005;
    }
}