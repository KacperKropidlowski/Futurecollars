package Task1;

public class Text {
    private static boolean checkExistenceOfContent(String text) {
        return !text.isBlank();
    }

    public static void isPalindromeAndGetTextLength(String text) {
        try {
            if (checkExistenceOfContent(text)) {
                System.out.println(text.equals(new StringBuilder(text).reverse().toString()));
                System.out.println(text.length());
            }
        } catch (NullPointerException e) {
            System.out.println("null in input");
        }
    }
}

