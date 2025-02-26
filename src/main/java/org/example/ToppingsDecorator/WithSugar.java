package org.example.ToppingsDecorator;

import org.example.coffeeFactory.Coffee;
import org.example.coffeeFactory.ICoffee;

public class WithSugar implements Topping {

    private final ICoffee coffee;

    public WithSugar(ICoffee coffee) {
        this.coffee = coffee;
        setDrinkPrice(getDrinkPrice() + 0.2);
        setDrinkType(getDrinkType() + " avec sucre");
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
