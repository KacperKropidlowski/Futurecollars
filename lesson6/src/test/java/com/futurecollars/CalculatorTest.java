package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldAddTwoValues1and1() {
        //given
        int value1 = 1;
        int value2 = 1;
        //when
        int result = Calculator.add(value1, value2);
        //then
        Assertions.assertEquals(2, result);
    }

    @Test
    void shouldAddTwoValues2and2() {
        //given
        int value1 = 2;
        int value2 = 2;
        //when
        int result = Calculator.add(value1, value2);
        //then
        Assertions.assertEquals(4, result);
    }

    @Test
    void shouldSubtractTwoValues1and1() {
        //given
        int value1 = 1;
        int value2 = 1;
        //when
        int result = Calculator.subtract(value1, value2);
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void shouldSubtractTwoValues4and2() {
        //given
        int value1 = 4;
        int value2 = 2;
        //when
        int result = Calculator.subtract(value1, value2);
        //then
        Assertions.assertEquals(2, result);
    }

    @Test
    void shouldMultiplyTwoValues1and1() {
        //given
        int value1 = 1;
        int value2 = 1;
        //when
        int result = Calculator.multiply(value1, value2);
        //then
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldMultiplyTwoValues2and2() {
        //given
        int value1 = 2;
        int value2 = 2;
        //when
        int result = Calculator.multiply(value1, value2);
        //then
        Assertions.assertEquals(4, result);
    }

    @Test
    void shouldDivideTwoValues1and1() {
        //given
        int value1 = 1;
        int value2 = 1;
        //when
        int result = Calculator.divide(value1, value2);
        //then
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldDivideTwoValues4and2() {
        //given
        int value1 = 4;
        int value2 = 2;
        //when
        int result = Calculator.divide(value1, value2);
        //then
        Assertions.assertEquals(2, result);
    }
}