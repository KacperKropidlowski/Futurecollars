package Task1;

public class Numbers {
    public static boolean isDivisibleBy2(int number) {
        return number % 2 == 0;
    }

    public static int sumDigitsOfNumber(String number) {
        return String.valueOf(number).chars().map(Character::getNumericValue).sum();
    }
}
