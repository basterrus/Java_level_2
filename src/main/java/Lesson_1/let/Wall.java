package Lesson_1.let;

public class Wall extends Obstacle{
    //Класс препятствия - стена

    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }
}
