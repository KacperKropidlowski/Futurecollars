package Task4;

public class ToUpperCaseClass implements TextFormatter {

    public ToUpperCaseClass() {
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
