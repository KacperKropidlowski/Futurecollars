package Task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataBackwardsSetter {
    public static void setDataBackwards(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String data;
        String wholeData = "";
        String dataBackwards = "";
        while ((data = br.readLine()) != null) {
            wholeData += data + "\n";
            StringBuilder sb = new StringBuilder(wholeData);
            dataBackwards = sb.reverse().toString();
        }
        System.out.println(dataBackwards);
    }
}
