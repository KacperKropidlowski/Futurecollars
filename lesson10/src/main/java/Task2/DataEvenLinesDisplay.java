package Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class DataEvenLinesDisplay {
    public static void displayDataEvenLines(String path) {
        try (BufferedReader br = new LineNumberReader(new FileReader(path))) {
            String line;
            int counter = 0;
            while ((line = br.readLine()) != null) {
                if (counter % 2 == 0) {
                    System.out.println(line);
                    counter++;
                } else {
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
