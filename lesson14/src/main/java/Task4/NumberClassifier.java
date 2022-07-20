package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberClassifier {
    private final static Pattern INTEGERS_PATTERN = Pattern.compile("^(\\d+)$");
    private final static Pattern FLOATING_POINT_NUMBERS_PATTERN = Pattern.compile("^(\\d+)\\.(\\d+)$");
    private final static Pattern NUMBERS_IN_SCIENTIFIC_NOTATION_PATTERN = Pattern.compile("^\\d\\.(\\d)+[eE][+-](\\d)+$");



    public void classifyNumbers(List<String> numbers) {
        System.out.println("Arguments classification:\nIntegers: " + getIntegersFromPattern(numbers, INTEGERS_PATTERN)
                + "\nFloating Point Numbers: " + getIntegersFromPattern(numbers, FLOATING_POINT_NUMBERS_PATTERN)
                + "\nNumbers in scientific notation: " + getIntegersFromPattern(numbers, NUMBERS_IN_SCIENTIFIC_NOTATION_PATTERN));
    }

    private List<String> getIntegersFromPattern(List<String> numbers, Pattern pattern) {
        List<String> result = new ArrayList<>();
        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            boolean matches = matcher.matches();
            if (matches) {
                result.add(number);
            }
        }
        return result;
    }
}
