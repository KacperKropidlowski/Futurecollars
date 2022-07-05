package Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataCharacterCounter {
    public static int countDataCharacter(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String data;
        int charCounter = 0;
        while ((data = br.readLine()) != null) {
            charCounter += data.length();
        }
        return charCounter;
    }
}