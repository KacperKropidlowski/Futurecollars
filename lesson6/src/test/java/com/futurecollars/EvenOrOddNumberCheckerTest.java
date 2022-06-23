package com.futurecollars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddNumberCheckerTest {

    @Test
    void shouldCheckIfNumberIsEven() {
        //given
        int number = 12;
        //when
        boolean result = EvenOrOddNumberChecker.checkIfNumberIsEven(number);
        //then
        assertTrue(result);
    }

    @Test
    void shouldCheckIfNumberIsEven2() {
        //given
        int number = 13;
        //when
        boolean result = EvenOrOddNumberChecker.checkIfNumberIsEven(number);
        //then
        assertFalse(result);
    }

    @Test
    void shouldCheckIfNumberIsOdd() {
        //given
        int number = 12;
        //when
        boolean result = EvenOrOddNumberChecker.checkIfNumberIsOdd(number);
        //then
        assertFalse(result);
    }

    @Test
    void shouldCheckIfNumberIsOdd2() {
        //given
        int number = 13;
        //when
        boolean result = EvenOrOddNumberChecker.checkIfNumberIsOdd(number);
        //then
        assertTrue(result);
    }
}