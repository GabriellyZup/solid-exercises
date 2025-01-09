package o.exercicio.bonus.services;

public class CheckingAccountTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.01;
    }
}