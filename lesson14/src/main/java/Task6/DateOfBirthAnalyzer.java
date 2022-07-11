package Task6;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateOfBirthAnalyzer {

    public void analyzeDateOfBirth(String dateOfBirthInput) {

        LocalDate dateNow = LocalDate.now();
        Pattern datePattern = Pattern.compile("^(1\\d{3}|20[0-1]\\d|202[0-2])-(0[1-9]|1[0-2])-(0[1-9]|1\\d|2\\d|3[0-1])$");
        Matcher dateMatcher = datePattern.matcher(dateOfBirthInput);

        boolean matches = dateMatcher.find();
        if (matches) {
            LocalDate dateOfBirth = LocalDate.parse(dateOfBirthInput);
            Period age = Period.between(dateOfBirth, dateNow);
            System.out.println("You are " + age.getYears() + " years old.");
            System.out.println("You were born on " + dateOfBirth.getDayOfWeek().toString().toLowerCase() + ".");
            System.out.println("You were born in " + dateOfBirth.getDayOfYear() / 7 + " week of the year.");
        } else {
            System.out.println("Wrong format of date!");
        }
    }
}