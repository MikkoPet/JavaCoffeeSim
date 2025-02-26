package org.example.paymentStrategy;

public class CreditPayment implements PaymentMethod {
    @Override
    public String pay(double amount) {
        //return "Successfully paid " + amount + "$ through credit";
        return "Carte";
    }
}
