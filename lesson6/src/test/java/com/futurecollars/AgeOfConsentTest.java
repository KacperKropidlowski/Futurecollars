package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AgeOfConsentTest {

    @Test
    void shouldCheckIf18isAgeOfConsent() {
        //given
        int value1 = 18;
        //when
        boolean result1 = AgeOfConsent.check(value1);
        //then
        assertTrue(result1);
    }

    @Test
    void shouldCheckIf19isAgeOfConsent() {
        //given
        int value2 = 19;
        //when
        boolean result2 = AgeOfConsent.check(value2);
        //then
        assertTrue(result2);
    }

    @Test
    void shouldCheckIf17isAgeOfConsent() {
        //given
        int value3 = 17;
        //when
        boolean result3 = AgeOfConsent.check(value3);
        //then
        assertFalse(result3);
    }
}