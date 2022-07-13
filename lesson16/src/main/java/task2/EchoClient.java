package task2;


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        InputStreamReader inputStreamReader;
        try (Socket socket = new Socket("localhost", 5555)) {

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println(string);
            printWriter.flush();

            inputStreamReader = new InputStreamReader(socket.getInputStream());

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String result = bufferedReader.readLine();
            System.out.println(result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}