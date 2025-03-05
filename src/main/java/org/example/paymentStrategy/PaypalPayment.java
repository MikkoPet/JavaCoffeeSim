package org.example.paymentStrategy;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paiment effectué par Paypal de " + amount);
    }
}
