package Task4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberClassifier {

    public static void main(String[] args) {
        NumberClassifier numberClassifier = new NumberClassifier();
        ArrayList<String> numbers = new ArrayList<>();
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

    public void classifyNumbers(ArrayList<String> numbers) {
        System.out.println("Arguments classification:\nIntegers: " + getIntegers(numbers)
                + "\nFloating Point Numbers: " + getFloatingPointNumbers(numbers)
                + "\nNumbers in scientific notation: " + getNumbersInScientificNotation(numbers));
    }

    public ArrayList<String> getIntegers(ArrayList<String> numbers) {
        ArrayList<String> integers = new ArrayList<>();
        Pattern integersPattern = Pattern.compile("^(\\d+)$");
        for (String number : numbers) {
            Matcher integersMatcher = integersPattern.matcher(number);
            boolean matchesIntegers = integersMatcher.matches();
            if (matchesIntegers) {
                integers.add(number);
            }
        }
        return integers;
    }

    public ArrayList<String> getFloatingPointNumbers(ArrayList<String> numbers) {
        ArrayList<String> floatingPointNumbers = new ArrayList<>();
        Pattern floatingPointNumbersPattern = Pattern.compile("^(\\d+)\\.(\\d+)$");
        for (String number : numbers) {
            Matcher floatingPointNumbersMatcher = floatingPointNumbersPattern.matcher(number);
            boolean matchesFloatingPointNumbers = floatingPointNumbersMatcher.matches();
            if (matchesFloatingPointNumbers) {
                floatingPointNumbers.add(number);
            }
        }
        return floatingPointNumbers;
    }

    public ArrayList<String> getNumbersInScientificNotation(ArrayList<String> numbers) {
        ArrayList<String> numbersInScientificNotation = new ArrayList<>();
        Pattern numbersInScientificNotationPattern = Pattern.compile("^\\d\\.(\\d)+[eE][+-](\\d)+$");
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
