package Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataDisplay {
    public static void dataDisplay() {
        String content = "";
        try {
            content = Files.readString(Paths.get("C:/Users/User/IdeaProjects/futurecollars/data.txt"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println(content);
    }
}
