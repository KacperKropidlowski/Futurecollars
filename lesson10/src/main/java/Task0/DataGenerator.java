package Task0;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class DataGenerator {
    public static void main(String[] args) {
        String dataPathname = "C:/Users/User/IdeaProjects/futurecollars/lesson10/src/main/resources/data.txt";
        File data = new File(dataPathname);
        try {
            data.createNewFile();
            Files.writeString(Path.of(String.valueOf(data)), "Kurs\nJava\nLekcjca6\nPliki\nWyjątki\nPliki\nKoniec", StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
