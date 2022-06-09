package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add() {
        Assertions.assertEquals(Calculator.add(1, 1), 2);
        Assertions.assertEquals(Calculator.add(2, 2), 4);
    }

    @Test
    void subtract() {
        Assertions.assertEquals(Calculator.subtract(1, 1), 0);
        Assertions.assertEquals(Calculator.subtract(4, 2), 2);
    }

    @Test
    void multiply() {
        Assertions.assertEquals(Calculator.multiply(1, 1), 1);
        Assertions.assertEquals(Calculator.multiply(2, 2), 4);
    }

    @Test
    void divide() {
        Assertions.assertEquals(Calculator.divide(1, 1), 1);
        Assertions.assertEquals(Calculator.divide(4, 2), 2);
    }
}