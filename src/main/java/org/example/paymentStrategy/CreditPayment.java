package org.example.paymentStrategy;

public class CreditPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paiment effectué par carte de " + amount);
    }
}
