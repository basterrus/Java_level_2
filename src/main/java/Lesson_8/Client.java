package Lesson_8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Client extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("client-ui.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Client network chat v 0.1");
        stage.setScene(scene);
        stage.setX(100);
        stage.setY(100);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}