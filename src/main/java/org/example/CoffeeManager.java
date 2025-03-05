package org.example;

import org.example.ToppingsDecorator.WithChocolate;
import org.example.coffeeFactory.Coffee;
import org.example.coffeeFactory.Espresso;
import org.example.coffeeFactory.MilkCoffee;
import org.example.coffeeFactory.ICoffee;
import org.example.paymentStrategy.CreditPayment;
import org.example.paymentStrategy.InvoicePayment;
import org.example.paymentStrategy.PaypalPayment;

public final class CoffeeManager {

    private static CoffeeManager instance;

    private static boolean isReady;
    private static boolean isPaid;

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

    public static void run() {
        int welcomeChoice = 0;
        int coffeeChoice = 0;
        int toppingsChoice = 0;
        int paymentChoice = 0;
        int confirm = 0;

        ICoffee coffee = new Espresso();

        while(welcomeChoice == 0) {
            welcomeChoice = View.showMenuWelcome();
            if (welcomeChoice == 2) {
                return;
            }
        }
        while(coffeeChoice == 0) {
            coffeeChoice = View.showMenuCoffee();
            if (coffeeChoice == 1) {
                coffee = new Espresso();
            } else if ( coffeeChoice == 2) {
                coffee = new MilkCoffee();
            }
        }
        while(toppingsChoice != 3){
            toppingsChoice = View.showMenuToppings();
            if(toppingsChoice == 1) {
                coffee = new WithChocolate(coffee);
            }
        }
        while(paymentChoice == 0) {
            paymentChoice = View.showMenuPayOptions();
        }
        while (confirm == 0) {
            confirm = View.showRecap(coffee.getDrinkType(), coffee.getDrinkPrice(), coffee.getToppings());
            if (confirm == 1) {
                switch (paymentChoice) {
                    case 1:
                        new CreditPayment().pay(coffee.getDrinkPrice());
                        break;
                    case 2:
                        new PaypalPayment().pay(coffee.getDrinkPrice());
                        break;
                    case 3:
                        new InvoicePayment().pay(coffee.getDrinkPrice());
                        break;
                    default:
                        break;
                }
                CoffeeManager.setPaid(true);
                CoffeeManager.setReady(true);
            }
        }

    }

    public static void setPaid(boolean paid) {
        isPaid = paid;
    }

    public static void setReady(boolean ready) {
        isReady = ready;
    }

    public static boolean isPaid() {
        return isPaid;
    }

    public static boolean isReady() {
        return isReady;
    }
}
