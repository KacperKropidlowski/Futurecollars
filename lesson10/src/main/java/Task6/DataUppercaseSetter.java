package Task6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataUppercaseSetter {

    public static void main(String[] args) throws IOException {
        DataUppercaseSetter.dataToUppercase("C:\\Users\\User\\IdeaProjects\\futurecollars\\lesson10\\src\\main\\resources\\data.txt","C:\\Users\\User\\IdeaProjects\\futurecollars\\lesson10\\src\\main\\resources\\output.txt");
    }
    public static void dataToUppercase(String pathIn, String pathOut) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathIn));
        String data;
        String dataToUppercase = "";
        while ((data = br.readLine()) != null) {
            dataToUppercase += data.toUpperCase() + "\n";
            Files.writeString(Path.of(pathOut),dataToUppercase);
        }
    }
}
