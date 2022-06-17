package Task1;

public class Text {
    public static boolean checkExistenceOfContent(String text) {
        return !text.isBlank() || !text.isEmpty();
    }

    public static boolean isPalindrome(String text) {
        if (Text.checkExistenceOfContent(text)) {
            return text.equals(new StringBuilder(text).reverse().toString());
        } else {
            return false;
        }
    }

    public static int getTextLength(String text) {
        if (Text.checkExistenceOfContent(text)) {
            return text.length();
        } else {
            return 0;
        }
    }
}

