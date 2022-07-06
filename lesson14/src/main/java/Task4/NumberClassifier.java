package Task4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberClassifier {

    public static void main(String[] args) {
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
        classifyNumbers(numbers);

    }

    public static void classifyNumbers (ArrayList<String> numbers){
        ArrayList<String> integers = new ArrayList<>();
        ArrayList<String> floatingPointNumbers = new ArrayList<>();
        ArrayList<String> numbersInScientificNotation = new ArrayList<>();
        ArrayList<String> misfits = new ArrayList<>();
        Pattern integersPattern = Pattern.compile("^(\\d+)$");
        Pattern floatingPointNumbersPattern = Pattern.compile("^(\\d+)\\.(\\d+)$");
        Pattern numbersInScientificNotationPattern = Pattern.compile("^([\\dA-Za-z\\.\\+\\-]+)$");

        for (String number : numbers) {
            Matcher integersMatcher = integersPattern.matcher(number);
            boolean matchesIntegers = integersMatcher.matches();
            Matcher floatingPointNumbersMatcher = floatingPointNumbersPattern.matcher(number);
            boolean matchesFloatingPointNumbers = floatingPointNumbersMatcher.matches();
            Matcher numbersInScientificNotationMatcher = numbersInScientificNotationPattern.matcher(number);
            boolean matchesNumbersInScientificNotation = numbersInScientificNotationMatcher.matches();
            if (matchesIntegers) {
                integers.add(number);
            } else if (matchesFloatingPointNumbers) {
                floatingPointNumbers.add(number);
            } else if (matchesNumbersInScientificNotation) {
                numbersInScientificNotation.add(number);
            } else {
                misfits.add(number);
            }
        }
        System.out.println("Arguments classification:\nIntegers: " + integers + "\nFloating Point Numbers: " + floatingPointNumbers + "\nNumbers in scientific notation: " + numbersInScientificNotation + "\nUnclassified arguments: " + misfits);
    }
}
