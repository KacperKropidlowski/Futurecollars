package Task4;

public class ToLowerCaseClass implements TextFormatter {
    public ToLowerCaseClass() {
    }

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}