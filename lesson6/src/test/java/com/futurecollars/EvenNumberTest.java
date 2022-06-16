package com.futurecollars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberTest {

    @Test
    void shouldCheckIs12evenNumber() {
        //given
        int value1 = 12;
        //when
        boolean result = EvenNumber.check(value1);
        //then
        assertTrue(result);
    }

    @Test
    void shouldCheckIs13evenNumber() {
        //given
        int value1 = 13;
        //when
        boolean result = EvenNumber.check(value1);
        //then
        assertFalse(result);
    }
}