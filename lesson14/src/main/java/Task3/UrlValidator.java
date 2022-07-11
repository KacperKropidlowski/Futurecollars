package Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {

    public void validateUrl(String url) {
        Pattern urlPattern = Pattern.compile("^https?://(w{3}\\.)?[a-z0-9]+(\\.[a-z0-9]+)?(\\.pl|\\.com)$");
        Matcher urlMatcher = urlPattern.matcher(url);
        boolean matches = urlMatcher.find();
        if (matches) {
            System.out.println("URL " + url + " is valid");
        } else {
            System.out.println("WRONG FORMAT OF URL!");
        }
    }
}
