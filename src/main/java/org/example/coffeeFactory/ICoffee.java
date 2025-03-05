package org.example.coffeeFactory;

import java.util.ArrayList;

public interface ICoffee {

    public String getDrinkType();
    public void setDrinkType(String type);

    public double getDrinkPrice();
    public void setDrinkPrice(double price);

    public void addTopping(String topping);
    public ArrayList<String> getToppings();
}
