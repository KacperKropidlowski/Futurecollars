package Task2;

public class Uppercaser {
    public static String setUppercase(String text) throws NullPointerException {
        try {
            return text.toUpperCase();
        } catch (NullPointerException n) {
            return "null";
        }
    }
}
