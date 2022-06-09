package com.futurecollars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberTest {

    @Test
    void check() {
        assertTrue(EvenNumber.check(12));
        assertFalse(EvenNumber.check(13));
    }
}