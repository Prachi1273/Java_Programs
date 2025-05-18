import java.net.*;

public class server2 {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(9876); // Open UDP port 9876
            byte[] receiveBuffer = new byte[1024];

            System.out.println("UDP Server is running and waiting for client messages...");

            while (true) {
                // Receive data from client
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                serverSocket.receive(receivePacket);
                
                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Client: " + clientMessage);

                if (clientMessage.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                // Send response to client
                String serverResponse = "Message received: " + clientMessage;
                byte[] sendBuffer = serverResponse.getBytes();

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);
            }

            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

