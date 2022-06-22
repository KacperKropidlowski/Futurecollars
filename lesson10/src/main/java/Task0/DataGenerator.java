package Task0;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public static void main(String[] args) throws IOException {
        List<String> lines = Arrays.asList("Kurs", "Java", "Lekcja 6", "Pliki", "Wyjątki", "Pliki", "Koniec pliku");
        Path data = Paths.get("data.txt");
        Files.write(data, lines, StandardCharsets.UTF_8);
    }
}
