package Task7;

public class SquareRootGetter {
    public static double getSquareRoot(double number) throws IllegalArgumentException {
        if (number >= 0) {
            return Math.sqrt(number);
        } else {
            throw new IllegalArgumentException("Number is negative!");
        }
    }
}
