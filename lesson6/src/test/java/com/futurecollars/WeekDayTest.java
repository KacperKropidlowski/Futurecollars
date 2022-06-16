package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayTest {

    @Test
    void shouldCheckIsFirstDayOfWeekIsMonday() {
        //given
        int value1 = 1;
        //when
        String result = WeekDay.weekday(value1);
        //then
        assertEquals("Monday", result);
    }

    @Test
    void shouldCheckIsSecondDayOfWeekIsTuesday() {
        //given
        int value1 = 2;
        //when
        String result = WeekDay.weekday(value1);
        //then
        assertEquals("Tuesday", result);
    }

    @Test
    void shouldCheckIsThirdDayOfWeekIsWednesday() {
        //given
        int value1 = 3;
        //when
        String result = WeekDay.weekday(value1);
        //then
        assertEquals("Wednesday", result);
    }

    @Test
    void shouldCheckIsFourthDayOfWeekIsThursday() {
        //given
        int value1 = 4;
        //when
        String result = WeekDay.weekday(value1);
        //then
        assertEquals("Thursday", result);
    }

    @Test
    void shouldCheckIsFifthDayOfWeekIsFriday() {
        //given
        int value1 = 5;
        //when
        String result = WeekDay.weekday(value1);
        //then
        assertEquals("Friday", result);
    }

    @Test
    void shouldCheckIsSixthDayOfWeekIsSaturday() {
        //given
        int value1 = 6;
        //when
        String result = WeekDay.weekday(value1);
        //then
        assertEquals("Saturday", result);
    }

    @Test
    void shouldCheckIsSeventhDayOfWeekIsSunday() {
        //given
        int value1 = 7;
        //when
        String result = WeekDay.weekday(value1);
        //then
        assertEquals("Sunday", result);
    }

    @Test
    void shouldCheckIsEighteenthDayOfWeekExist() {
        //given
        int value1 = 18;
        //when
        String result = WeekDay.weekday(value1);
        //then
        assertEquals("There is no such day!", result);
    }

}