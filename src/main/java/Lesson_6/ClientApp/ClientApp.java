package Lesson_6.ClientApp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    private Socket socket = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    public void start() {
        try {
            openConnection();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                final String msg = scanner.nextLine();
                out.writeUTF(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    private void closeConnection() {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void openConnection() throws IOException {
        socket = new Socket("localhost", 8189);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        new Thread(() -> {
            try {
                while (true) {
                    final String message = in.readUTF();
                    System.out.println("Сообщение от сервера: " + message);
                    if ("/end".equalsIgnoreCase(message)) {
                        System.out.println("Сервер разорвал соединение");
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeConnection();
            }
        }).start();

    }

}

