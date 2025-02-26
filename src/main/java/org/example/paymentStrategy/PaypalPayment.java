package org.example.paymentStrategy;

public class PaypalPayment implements PaymentMethod {
    @Override
    public String pay(double amount) {
        //return "Successfully paid " + amount + "$ through Paypal";
        return "Paypal";
    }
}
