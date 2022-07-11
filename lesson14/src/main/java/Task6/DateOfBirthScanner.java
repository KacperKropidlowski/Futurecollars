package Task6;

import java.util.Scanner;

public class DateOfBirthScanner {
    public static void main(String[] args) {
        DateOfBirthAnalyzer dateOfBirthAnalyzer = new DateOfBirthAnalyzer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter date your date of birth in format YYYY-MM-DD:");
        String dateOfBirthInput = scanner.nextLine();

        dateOfBirthAnalyzer.analyzeDateOfBirth(dateOfBirthInput);
    }
}
