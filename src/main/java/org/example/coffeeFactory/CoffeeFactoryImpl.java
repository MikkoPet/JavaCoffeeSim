package org.example.coffeeFactory;

public class CoffeeFactoryImpl implements CoffeeFactory {
    @Override
    public ICoffee createCoffee(String type) {
        ICoffee coffee = switch(type) {
            case "Espresso" -> new Espresso();
            case "Café au lait" -> new MilkCoffee();
            default -> null;
        };
        return coffee;
    }
}
