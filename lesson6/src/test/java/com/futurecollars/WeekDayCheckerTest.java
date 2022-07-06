package com.futurecollars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayCheckerTest {

    @Test
    void shouldCheckIfFirstDayOfWeekIsMonday() {
        //given
        int day = 1;
        //when
        String result = WeekDayChecker.checkWeekday(day);
        //then
        assertEquals("Monday", result);
    }

    @Test
    void shouldCheckIfSecondDayOfWeekIsTuesday() {
        //given
        int day = 2;
        //when
        String result = WeekDayChecker.checkWeekday(day);
        //then
        assertEquals("Tuesday", result);
    }

    @Test
    void shouldCheckIfThirdDayOfWeekIsWednesday() {
        //given
        int day = 3;
        //when
        String result = WeekDayChecker.checkWeekday(day);
        //then
        assertEquals("Wednesday", result);
    }

    @Test
    void shouldCheckIfFourthDayOfWeekIsThursday() {
        //given
        int day = 4;
        //when
        String result = WeekDayChecker.checkWeekday(day);
        //then
        assertEquals("Thursday", result);
    }

    @Test
    void shouldCheckIfFifthDayOfWeekIsFriday() {
        //given
        int day = 5;
        //when
        String result = WeekDayChecker.checkWeekday(day);
        //then
        assertEquals("Friday", result);
    }

    @Test
    void shouldCheckIfSixthDayOfWeekIsWeekend() {
        //given
        int day = 6;
        //when
        String result = WeekDayChecker.checkWeekday(day);
        //then
        assertEquals("Weekend", result);
    }

    @Test
    void shouldCheckIfSeventhDayOfWeekIsWeekend() {
        //given
        int day = 7;
        //when
        String result = WeekDayChecker.checkWeekday(day);
        //then
        assertEquals("Weekend", result);
    }

    @Test
    void shouldCheckIfDayOfWeekExists() {
        //given
        int day = 18;
        //when
        String result = WeekDayChecker.checkWeekday(day);
        //then
        assertEquals("There is no such day!", result);
    }

}