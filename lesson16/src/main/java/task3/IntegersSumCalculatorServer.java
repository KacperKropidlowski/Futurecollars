package task3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class IntegersSumCalculatorServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket;
        ServerSocket serverSocket = new ServerSocket(5555);
        socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        List<Integer> integers = (List<Integer>) objectInputStream.readObject();
        int result = integers.stream().reduce(0, Integer::sum);
        outputStream.write(result);

        serverSocket.close();
        socket.close();
    }
}
