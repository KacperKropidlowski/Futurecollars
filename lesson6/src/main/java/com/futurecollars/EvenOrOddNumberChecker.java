package com.futurecollars;

public class EvenOrOddNumberChecker {
    public static boolean IsEven(int number) {
        return !IsOdd(number);
    }

    public static boolean IsOdd(int number) {
        return number % 2 != 0;
    }
}

