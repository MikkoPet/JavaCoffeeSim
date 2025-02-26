package org.exemple;

import org.example.paymentStrategy.CreditPayment;
import org.example.paymentStrategy.InvoicePayment;
import org.example.paymentStrategy.PaypalPayment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentStrategyTester {
    @Test
    public void testPaypal() {
        String confirmPayment = new PaypalPayment().pay(5);

        assertEquals("Paypal", confirmPayment, "Paypal payment must send Paypal");
    }

    @Test
    public void testInvoice() {
        String confirmPayment = new InvoicePayment().pay(5);

        assertEquals("Virement", confirmPayment, "Paypal payment must send Paypal");
    }

    @Test
    public void testCredit() {
        String confirmPayment = new CreditPayment().pay(5);

        assertEquals("Carte", confirmPayment, "Paypal payment must send Paypal");
    }
}
