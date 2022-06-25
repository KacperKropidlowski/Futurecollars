package Task7;

public class SquareRootGetter {
    public static double getSquareRoot(double number) throws NumberIsNegativeException {
        if (number >= 0) {
            return Math.sqrt(number);
        } else {
            throw new NumberIsNegativeException("Number is negative!");
        }
    }
}
