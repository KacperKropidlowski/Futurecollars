package com.futurecollars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddNumberCheckerTest {

    @Test
    void shouldCheckIfNumberIsEven() {
        //given
        int number = 12;
        //when
        boolean result = EvenOrOddNumberChecker.IsEven(number);
        //then
        assertTrue(result);
    }

    @Test
    void shouldCheckIfNumberIsNotEven() {
        //given
        int number = 13;
        //when
        boolean result = EvenOrOddNumberChecker.IsEven(number);
        //then
        assertFalse(result);
    }

    @Test
    void shouldCheckIfNumberIsNotOdd() {
        //given
        int number = 12;
        //when
        boolean result = EvenOrOddNumberChecker.IsOdd(number);
        //then
        assertFalse(result);
    }

    @Test
    void shouldCheckIfNumberIsOdd() {
        //given
        int number = 13;
        //when
        boolean result = EvenOrOddNumberChecker.IsOdd(number);
        //then
        assertTrue(result);
    }
}