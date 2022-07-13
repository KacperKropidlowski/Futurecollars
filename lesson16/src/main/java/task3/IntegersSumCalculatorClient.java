package task3;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;

public class IntegersSumCalculatorClient {
    public static void main(String[] args) throws IOException {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Socket socket = new Socket("localhost", 5555);

        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(integers);
        System.out.println(inputStream.read());

        socket.close();
    }
}
