package Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataDisplay {
    public static void dataDisplay() {
        String content;
        try {
            content = Files.readString(Paths.get("C:/Users/User/IdeaProjects/futurecollars/lesson10/src/main/resources/data.txt"));
            System.out.println(content);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
