package Task8;

public class PeselValidator {
    public static boolean validatePesel(Object pesel) {
        try {
            if (!pesel.getClass().equals(String.class)) {
                throw new WrongTypeOfDataException("Wrong type of data!");
            }
            if (pesel.toString().length() != 11) {
                throw new IllegalLengthException("Illegal PESEL length!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
