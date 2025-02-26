package org.exemple;

import org.example.CoffeeManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeManagerTester {
    @Test
    public void testSingletonSingleInstance() {
        CoffeeManager instance1 = CoffeeManager.getInstance();
        CoffeeManager instance2 = CoffeeManager.getInstance();

        assertSame(instance1, instance2, "Both instances must point to the same one reference.");
    }

    @Test
    public void testSingletonNotNull() {
        CoffeeManager instance = CoffeeManager.getInstance();
        assertNotNull(instance, "The instance must not be null.");
    }
}
