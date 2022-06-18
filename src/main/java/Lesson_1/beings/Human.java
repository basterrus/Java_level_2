package Lesson_1.beings;

import Lesson_1.interfaces.Movement;
import Lesson_1.let.Treadmill;
import Lesson_1.let.Wall;

public class Human implements Movement {
    private String name;
    private int maxLength;
    private int maxHeight;

    public Human(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getLength() > maxLength) {
            System.out.printf("Это расстояние слишком большое для %s! Человек выбывает из забега!", name);
            return false;
        }
        System.out.printf("Человек %s пробежал %d метров\n", name, treadmill.getLength());
        return true;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeigth() > maxHeight) {
            System.out.printf("Это высота слишком большая для %s! Человек обходит стену вокруг!", name);
            return false;
        }
        System.out.printf("Человек %s прыгнул на %d метров\n", name, wall.getHeigth());
        return true;
    }
}
