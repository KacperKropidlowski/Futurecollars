package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        //given
        int value1 = 1;
        int value2 = 1;
        //when
        int result = Calculator.add(value1, value2);
        //then
        Assertions.assertEquals(2, result);
    }

    @Test
    void shouldAddTwoNegativeNumbers() {
        //given
        int value1 = -2;
        int value2 = -2;
        //when
        int result = Calculator.add(value1, value2);
        //then
        Assertions.assertEquals(-4, result);
    }

    @Test
    void shouldAddTwoZeros() {
        //given
        int value1 = 0;
        int value2 = 0;
        //when
        int result = Calculator.add(value1, value2);
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void shouldSubtractTwoPositiveNumbers() {
        //given
        int value1 = 1;
        int value2 = 1;
        //when
        int result = Calculator.subtract(value1, value2);
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void shouldSubtractTwoNegativeNumbers() {
        //given
        int value1 = -4;
        int value2 = -2;
        //when
        int result = Calculator.subtract(value1, value2);
        //then
        Assertions.assertEquals(-2, result);
    }

    @Test
    void shouldSubtractTwoZeros() {
        //given
        int value1 = 0;
        int value2 = 0;
        //when
        int result = Calculator.subtract(value1, value2);
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void shouldMultiplyTwoPositiveNumbers() {
        //given
        int value1 = 1;
        int value2 = 1;
        //when
        int result = Calculator.multiply(value1, value2);
        //then
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldMultiplyTwoNegativeNumbers() {
        //given
        int value1 = -2;
        int value2 = -2;
        //when
        int result = Calculator.multiply(value1, value2);
        //then
        Assertions.assertEquals(4, result);
    }

    @Test
    void shouldMultiplyTwoZeros() {
        //given
        int value1 = 0;
        int value2 = 0;
        //when
        int result = Calculator.multiply(value1, value2);
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void shouldDivideTwoPositiveNumbers() {
        //given
        int value1 = 1;
        int value2 = 1;
        //when
        int result = Calculator.divide(value1, value2);
        //then
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldDivideTwoNegativeNumbers() {
        //given
        int value1 = -4;
        int value2 = -2;
        //when
        int result = Calculator.divide(value1, value2);
        //then
        Assertions.assertEquals(2, result);
    }

    @Test
    void shouldDivideZeroByPositiveNumber() {
        //given
        int value1 = 0;
        int value2 = 1;
        //when
        int result = Calculator.divide(value1, value2);
        //then
        Assertions.assertEquals(0, result);
    }
}