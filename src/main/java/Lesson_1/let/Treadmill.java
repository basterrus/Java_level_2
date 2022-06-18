package Lesson_1.let;

public class Treadmill extends Obstacle{
//    Класс препятствия - беговая дорожка
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
