package Task3;

import java.util.Scanner;

public class UrlScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UrlValidator urlValidator = new UrlValidator();

        System.out.println("Enter URL:");
        urlValidator.validateUrl(scanner.nextLine());
    }
}
