package Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataWordFinder {
    public static boolean isWordInData(String path, String word) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String data;
        boolean contains = false;
        while ((data = br.readLine()) != null) {
            if (data.contains(word)) {
                contains = true;
            }
        }
        return contains;
    }
}
