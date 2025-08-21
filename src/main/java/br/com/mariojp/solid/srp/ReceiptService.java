package br.com.mariojp.solid.srp;

public class ReceiptService {
    public String generate(Order order) {
        double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
        double tax = new TaxCalculator().calculate(subtotal);
        double total = subtotal + tax;
        return new ReceiptFormatter().format(order, subtotal, tax, total);
    }
}
