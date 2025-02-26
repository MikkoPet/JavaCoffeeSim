package org.example.paymentStrategy;

public class InvoicePayment implements PaymentMethod {
    @Override
    public String pay(double amount) {
        //return "Successfully paid " + amount + "$ through invoice";
        return "Virement";
    }
}
