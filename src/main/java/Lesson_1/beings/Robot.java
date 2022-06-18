package Lesson_1.beings;

import Lesson_1.interfaces.Movement;
import Lesson_1.let.Treadmill;
import Lesson_1.let.Wall;

public class Robot implements Movement {
    private String name;
    private int maxLength;
    private int maxHeight;

    public Robot(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getLength() > maxLength) {
            System.out.printf("Расстояние %d слишком большое для %s! Робот выбывает из забега!",treadmill.getLength(), name);
            return false;
        }
        System.out.printf("Робот %s пробежал %d метров\n", name, treadmill.getLength());
        return true;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeigth() > maxHeight) {
            System.out.printf("Это высота слишком большая для %s! Робот обходит стену вокруг!", name);
            return false;
        }
        System.out.printf("Робот %s прыгнул на %d метров\n", name, wall.getHeigth());
        return true;
    }
}
