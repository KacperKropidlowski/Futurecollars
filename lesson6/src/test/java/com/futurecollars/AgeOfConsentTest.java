package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeOfConsentTest {

    @Test
    void check() {
        assertTrue(AgeOfConsent.check(18));
        assertTrue(AgeOfConsent.check(19));
        assertFalse(AgeOfConsent.check(17));
    }
}