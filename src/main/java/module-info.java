module Lesson_8 {
    requires javafx.controls;
    requires javafx.fxml;

    exports Lesson_8;
    opens Lesson_8 to javafx.fxml;
    exports Lesson_8.client;
    opens Lesson_8.client to javafx.fxml;
}