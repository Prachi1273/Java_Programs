import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String userMessage, serverResponse;
            while (true) {
                System.out.print("Client: ");
                userMessage = consoleInput.readLine();
                output.println(userMessage);

                if (userMessage.equalsIgnoreCase("exit")) {
                    System.out.println("Disconnected from server.");
                    break;
                }

                serverResponse = input.readLine();
                if (serverResponse == null) {
                    System.out.println("Server disconnected.");
                    break;
                }
                System.out.println("Server: " + serverResponse);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

