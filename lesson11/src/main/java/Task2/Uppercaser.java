package Task2;

public class Uppercaser {
    public static String setUppercase(String text) {
        String n = "null";
        String e = "empty";
        if (text == null) {
            return n;
        } else if (text.equals("")) {
            return e;
        } else {
            return text.toUpperCase();
        }
    }
}
