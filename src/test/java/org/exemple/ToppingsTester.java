package org.exemple;

import org.example.ToppingsDecorator.WithChocolate;
import org.example.ToppingsDecorator.WithSugar;
import org.example.coffeeFactory.Coffee;
import org.example.coffeeFactory.Espresso;
import org.example.coffeeFactory.ICoffee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToppingsTester {
    @Test
    public void testSugarAddition() {
        ICoffee instanceCoffee = new WithSugar(new WithChocolate(new Espresso()));

        assertEquals(2.7, instanceCoffee.getDrinkPrice(), "Price must be total of all additions");
    }
}
