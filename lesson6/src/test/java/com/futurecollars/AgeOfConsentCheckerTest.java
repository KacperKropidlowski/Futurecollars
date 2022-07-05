package com.futurecollars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AgeOfConsentCheckerTest {

    @Test
    void shouldCheckIfAgeIsAgeOfConsent() {
        //given
        int age = 18;
        //when
        boolean result = AgeOfConsentChecker.isAgeOfConsent(age);
        //then
        assertTrue(result);
    }

    @Test
    void shouldCheckIfAgeIsAgeOfConsent2() {
        //given
        int age = 19;
        //when
        boolean result = AgeOfConsentChecker.isAgeOfConsent(age);
        //then
        assertTrue(result);
    }

    @Test
    void shouldCheckIfAgeIsAgeOfConsent3() {
        //given
        int age = 17;
        //when
        boolean result = AgeOfConsentChecker.isAgeOfConsent(age);
        //then
        assertFalse(result);
    }
}