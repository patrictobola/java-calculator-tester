package org.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(8.0f, calculator.add(5.0f, 3.0f), 0.0001);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2.0f, calculator.subtract(5.0f, 3.0f), 0.0001);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(3.0f, calculator.divide(6.0f, 2.0f), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6.0f, 0.0f));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(8.0f, calculator.multiply(4.0f, 2.0f), 0.0001);
    }
}

