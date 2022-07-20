package Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
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
}