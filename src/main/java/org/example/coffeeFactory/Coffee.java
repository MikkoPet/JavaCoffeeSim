package org.example.coffeeFactory;

import java.util.ArrayList;

public abstract class Coffee implements ICoffee {
    private String drinkType;
    private double drinkPrice;
    private ArrayList<String> toppings;

    public Coffee(double price, String type) {
        drinkType = type;
        drinkPrice = price;
    }

    @Override
    public String getDrinkType() {
        return drinkType;
    }
    @Override
    public double getDrinkPrice() {
        return drinkPrice;
    }
    @Override
    public void setDrinkType(String type) {
        drinkType = type;
    }
    @Override
    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
    @Override
    public void addTopping(String topping) {
        toppings.add(topping);
    }
    @Override
    public ArrayList<String> getToppings() {
        return toppings;
    }
}
