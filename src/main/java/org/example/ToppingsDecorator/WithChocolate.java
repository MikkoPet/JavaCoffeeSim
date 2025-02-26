package org.example.ToppingsDecorator;

import org.example.coffeeFactory.Coffee;
import org.example.coffeeFactory.ICoffee;

public class WithChocolate implements Topping {
    private final ICoffee coffee;

    public WithChocolate(ICoffee coffee) {
        this.coffee = coffee;
        setDrinkPrice(getDrinkPrice() + 0.5);
        setDrinkType(getDrinkType() + " supplément chocolat");
    }

    @Override
    public void setDrinkType(String type) {
        coffee.setDrinkType(type);
    }

    @Override
    public void setDrinkPrice(double price) {
        coffee.setDrinkPrice(price);
    }

    @Override
    public String getDrinkType() {
        return coffee.getDrinkType();
    }

    @Override
    public double getDrinkPrice() {
        return coffee.getDrinkPrice();
    }
}
