package Task5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password\nYour password should contain:\n-at least one capital letter\n-at least one digit\n-at least seven characters\nDo not use current year or its two last digit in your password");
        String password = scanner.nextLine();
        Pattern passwordPattern = Pattern.compile("^((?=\\S*?[A-Z])(?=\\S*?\\d).{7,})$");
        Matcher passwordMatcher = passwordPattern.matcher(password);
        boolean matches = passwordMatcher.find();
        if (matches) {
            if (password.contains("2022")) {
                System.out.println("Come up with a better password buddy!");
            } else if (password.contains("22")) {
                System.out.println("Come up with a better password buddy!");
            } else
                System.out.println("Your password " + password + " is strong buddy!");
        } else {
            System.out.println("Come up with a better password buddy!");
        }
    }
}
