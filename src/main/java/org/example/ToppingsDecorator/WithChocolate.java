package org.example.ToppingsDecorator;

import org.example.coffeeFactory.Coffee;
import org.example.coffeeFactory.ICoffee;

import java.util.ArrayList;

public class WithChocolate implements ICoffee {
    private final ICoffee coffee;

    public WithChocolate(ICoffee coffee) {
        this.coffee = coffee;
        setDrinkPrice(getDrinkPrice() + 0.5);
        setDrinkType(getDrinkType() + " supplément chocolat");
        addTopping("Chocolat");
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

    @Override
    public void addTopping(String topping) {
        coffee.addTopping(topping);
    }

    @Override
    public ArrayList<String> getToppings() {
        return coffee.getToppings();
    }
}
