package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayTest {

    @Test
    void weekday() {
        Assertions.assertEquals(WeekDay.weekday(1), "Monday");
        Assertions.assertEquals(WeekDay.weekday(2), "Tuesday");
        Assertions.assertEquals(WeekDay.weekday(3), "Wednesday");
        Assertions.assertEquals(WeekDay.weekday(4), "Thursday");
        Assertions.assertEquals(WeekDay.weekday(5), "Friday");
        Assertions.assertEquals(WeekDay.weekday(6), "Saturday");
        Assertions.assertEquals(WeekDay.weekday(7), "Sunday");
        Assertions.assertEquals(WeekDay.weekday(18), "There is no such day!");
    }
}