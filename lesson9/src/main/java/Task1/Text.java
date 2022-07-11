package Task1;

public class Text {

    public void analyzeText(String text) {
        if (hasContent(text)) {
            printIfPalindrome(text);
            printLength(text);
        } else System.out.println("Text is blank!");
    }

    private boolean hasContent(String text) {
        return !text.isBlank();
    }

    private boolean isPalindrome(String text) {
        String textInLowerCase = text.toLowerCase();
        return textInLowerCase.equals(new StringBuilder(textInLowerCase).reverse().toString());
    }

    private void printLength(String text) {
        System.out.println("Text length: " + text.length());
    }

    private void printIfPalindrome(String text) {
        System.out.println("Text is palindrome: " + isPalindrome(text));
    }
}

