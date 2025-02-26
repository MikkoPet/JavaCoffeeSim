package org.example;

import org.example.coffeeFactory.Coffee;

public final class CoffeeManager {

    private static CoffeeManager instance;

    private String paymentType;
    private boolean isReady;
    private boolean isPaid;

    private CoffeeManager() {
        isPaid = false;
        isReady = false;
    }

    public static CoffeeManager getInstance() {
        if (instance == null) {
            instance = new CoffeeManager();
        }
        return instance;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public boolean isReady() {
        return isReady;
    }
}
