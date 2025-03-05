package org.example.paymentStrategy;

public class InvoicePayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paiment effectué par virement de " + amount);
    }
}
