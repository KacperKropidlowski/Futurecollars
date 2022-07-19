package Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter PESEL:");
        String pesel = scanner.nextLine();
        Pattern peselPattern = Pattern.compile("\\d{9}");
        Matcher peselMatcher = peselPattern.matcher(pesel);
        boolean matches = peselMatcher.find();
        if (matches) {
            System.out.println("Your PESEL " + pesel + " is valid");
        } else {
            System.out.println("WRONG FORMAT OF PESEL!");
        }

    }

}
