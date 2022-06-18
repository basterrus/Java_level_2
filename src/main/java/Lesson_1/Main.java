package Lesson_1;

import Lesson_1.beings.Cat;
import Lesson_1.beings.Human;
import Lesson_1.beings.Robot;
import Lesson_1.interfaces.Movement;
import Lesson_1.let.Obstacle;
import Lesson_1.let.Treadmill;
import Lesson_1.let.Wall;

public class Main {
    public static void main(String[] args) {

        Movement[] movements = {
                new Cat("Васька", 200, 2),
                new Cat("Барсик", 150, 1),
                new Human("Петрович", 2000, 2),
                new Human("Иваныч", 1500, 1),
                new Robot("R2D2", 5000, 0),
        };

        Obstacle[] obstacles = {
                new Treadmill(100),
                new Wall(1),
                new Treadmill(200),
                new Wall(2),
                new Treadmill(1000),
                new Wall(2),
                new Treadmill(2100),
                new Wall(3),
                new Treadmill(5000),
                new Wall(1),
        };

        for (Movement movement : movements) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Treadmill)
                    if (!movement.run((Treadmill) obstacle)) break;
                if (obstacle instanceof Wall)
                    if (!movement.jump((Wall) obstacle)) break;

            }
            System.out.println();
        }
    }

}
