package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberClassifier {
    private final static Pattern integersPattern = Pattern.compile("^(\\d+)$");
    private final static Pattern floatingPointNumbersPattern = Pattern.compile("^(\\d+)\\.(\\d+)$");
    private final static Pattern numbersInScientificNotationPattern = Pattern.compile("^\\d\\.(\\d)+[eE][+-](\\d)+$");

    public static void main(String[] args) {
        NumberClassifier numberClassifier = new NumberClassifier();
        List<String> numbers = new ArrayList<>();
        numbers.add("342");
        numbers.add("5.34");
        numbers.add("756");
        numbers.add("1.234e+07");
        numbers.add("7.234243E-02");
        numbers.add("6.09");
        numbers.add("3457");
        numbers.add("87");
        numbers.add("1.0001");
        numbers.add("3");
        numbers.add("5");

        System.out.println("All arguments: " + numbers);
        numberClassifier.classifyNumbers(numbers);

    }

    public void classifyNumbers(List<String> numbers) {
        System.out.println("Arguments classification:\nIntegers: " + getIntegers(numbers)
                + "\nFloating Point Numbers: " + getFloatingPointNumbers(numbers)
                + "\nNumbers in scientific notation: " + getNumbersInScientificNotation(numbers));
    }

    public List<String> getIntegers(List<String> numbers) {
        List<String> integers = new ArrayList<>();
        for (String number : numbers) {
            Matcher integersMatcher = integersPattern.matcher(number);
            boolean matchesIntegers = integersMatcher.matches();
            if (matchesIntegers) {
                integers.add(number);
            }
        }
        return integers;
    }

    public List<String> getFloatingPointNumbers(List<String> numbers) {
        List<String> floatingPointNumbers = new ArrayList<>();
        for (String number : numbers) {
            Matcher floatingPointNumbersMatcher = floatingPointNumbersPattern.matcher(number);
            boolean matchesFloatingPointNumbers = floatingPointNumbersMatcher.matches();
            if (matchesFloatingPointNumbers) {
                floatingPointNumbers.add(number);
            }
        }
        return floatingPointNumbers;
    }

    public List<String> getNumbersInScientificNotation(List<String> numbers) {
        List<String> numbersInScientificNotation = new ArrayList<>();
        for (String number : numbers) {
            Matcher numbersInScientificNotationMatcher = numbersInScientificNotationPattern.matcher(number);
            boolean matchesNumbersInScientificNotation = numbersInScientificNotationMatcher.matches();
            if (matchesNumbersInScientificNotation) {
                numbersInScientificNotation.add(number);
            }
        }
        return numbersInScientificNotation;
    }
}
