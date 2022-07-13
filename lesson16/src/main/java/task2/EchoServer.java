package task2;

import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        Socket socket;
        try (ServerSocket serverSocket = new ServerSocket(5555)) {
            socket = serverSocket.accept();

            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String string = bufferedReader.readLine();
            System.out.println(string);

            String result = string.toUpperCase();

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println(result);
            printWriter.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}