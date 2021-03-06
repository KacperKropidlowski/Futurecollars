package Task6;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateOfBirth {

    public void analyzeDateOfBirth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter date your date of birth in format YYYY-MM-DD:");
        String dateOfBirthInput = scanner.nextLine();

        LocalDate dateNow = LocalDate.now();
        Pattern datePattern = Pattern.compile("^(1\\d{3}|20[0-1]\\d|202[0-2])-(0[1-9]|1[0-2])-(0[1-9]|1\\d|2\\d|3[0-1])$");
        Matcher dateMatcher = datePattern.matcher(dateOfBirthInput);

        boolean matches = dateMatcher.find();
        if (matches) {
            LocalDate dateOfBirth = LocalDate.parse(dateOfBirthInput);
            System.out.println("You are " + (dateNow.getYear() - dateOfBirth.getYear()) + " years old.");
            System.out.println("You were born on " + dateOfBirth.getDayOfWeek().toString().toLowerCase() + ".");
            System.out.println("You were born in " + dateOfBirth.getDayOfYear() / 7 + " week of the year.");
        } else {
            System.out.println("Wrong format of date!");
        }
    }
}