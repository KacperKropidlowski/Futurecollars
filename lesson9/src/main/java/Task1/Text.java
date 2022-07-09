package Task1;

public class Text {
    private boolean hasContent(String text) {
        return !text.isBlank();
    }

    private boolean isPalindrome(String text) {
        return text.toLowerCase().equals(new StringBuilder(text.toLowerCase()).reverse().toString());
    }

    private void getLength(String text) {
        System.out.println("Text length: " + text.length());
    }

    private void getPalindrome(String text) {
        System.out.println("Text is palindrome: " + isPalindrome(text));
    }

    public void analyzeText(String text) {
        if (hasContent(text)) {
            getPalindrome(text);
            getLength(text);
        } else throw new IllegalArgumentException("Text is blank!");
    }
}

