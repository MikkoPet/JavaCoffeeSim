package org.example.coffeeFactory;

public abstract class Coffee implements ICoffee {
    private String drinkType;
    private double drinkPrice;

    public Coffee(double price, String type) {
        drinkType = type;
        drinkPrice = price;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkType(String type) {
        this.drinkType = type;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
}
