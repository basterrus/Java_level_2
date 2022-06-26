package Lesson_1.interfaces;

import Lesson_1.let.Treadmill;
import Lesson_1.let.Wall;

public interface Movement {
    //интерфейс движений

    boolean run (Treadmill treadmill);
    boolean jump(Wall wall);
}
