package Task9;

import Task8.WrongTypeOfDataException;

public class DivisibleByThreeValidator {
    public static void validate(int[] values) {
        for (int value : values) {
            try {
                if (value % 3 != 0) {
                    throw new WrongTypeOfDataException("Value " + value + " is not divisible by 3!");
                }
            } catch (WrongTypeOfDataException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of validation!");
    }
}
