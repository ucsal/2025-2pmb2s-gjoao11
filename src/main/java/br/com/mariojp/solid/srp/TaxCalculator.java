package br.com.mariojp.solid.srp;

public class TaxCalculator {
    public double calculate(double subtotal) {
        return subtotal * Double.parseDouble(System.getProperty("tax.rate"));
    }
}
