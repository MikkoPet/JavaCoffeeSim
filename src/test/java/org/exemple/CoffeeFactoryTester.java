package org.exemple;

import org.example.coffeeFactory.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeFactoryTester {

    CoffeeFactoryImpl coffeeFactory = new CoffeeFactoryImpl();

    @Test
    public void testEspressoIsNotMilk() {
        ICoffee espresso = coffeeFactory.createCoffee("Espresso");
        ICoffee milkCoffee = coffeeFactory.createCoffee("Café au lait");

        assertNotEquals(milkCoffee.getDrinkType(), espresso.getDrinkType(), "Drink type of espresso and milk coffee must be different");
    }

    @Test
    public void espressoTypeIsCorrectAttribute() {
        ICoffee espresso = coffeeFactory.createCoffee("Espresso");

        assertEquals("Espresso", espresso.getDrinkType(), "Espresso drink type must be 'espresso'");
    }

    @Test
    public void milkCoffeeTypeIsCorrectAttribute() {
        ICoffee milkCoffee = coffeeFactory.createCoffee("Café au lait");

        assertEquals("Café au lait", milkCoffee.getDrinkType(), "milk coffee drink type must be 'café au lait'");
    }

    @Test
    public void wrongInputIsNull() {
        ICoffee noCoffee = coffeeFactory.createCoffee("Latte");

        assertNull(noCoffee, "Type of wrongly input drink must be null");
    }

}
