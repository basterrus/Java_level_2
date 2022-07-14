package Lesson_6.ServerApp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {
    public void start() {
        Socket socket;
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен, ожидаем подключения...");

            socket = serverSocket.accept();
            System.out.println("Клиент подключился");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            startServerConsoleChat(out);

            while (true) {
                String message = in.readUTF();
                System.out.println("Сообщение с клиента: " + message);
                if ("/end".equalsIgnoreCase(message)) {
                    out.writeUTF("/end");
                    break;
                }
            }
            System.out.println("Сервер остановлен");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Старт консольного серверного чата
     * @param out исходящий поток
     */
    private void startServerConsoleChat(DataOutputStream out) {
        new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                final String message = scanner.nextLine();
                try {
                    out.writeUTF(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
