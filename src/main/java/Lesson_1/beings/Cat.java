package Lesson_1.beings;

import Lesson_1.interfaces.Movement;
import Lesson_1.let.Treadmill;
import Lesson_1.let.Wall;

public class Cat implements Movement {

    private String name;
    private int maxLength;
    private int maxHeight;

    public Cat(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getLength() > maxLength) {
            System.out.printf("Это расстояние слишком большое для %s! Кот выбывает из забега!", name);
            return false;
        }
        System.out.printf("Кот %s пробежал %d метров\n", name, treadmill.getLength());
        return true;
    }


    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeigth() > maxHeight) {
            System.out.printf("Это высота слишком большая для %s! Кот обходит стену вокруг!", name);
            return false;
        }
        System.out.printf("Кот %s прыгнул на %d метров\n", name, wall.getHeigth());
        return true;
    }
}
