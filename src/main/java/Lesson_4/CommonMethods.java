package Lesson_4;

import java.util.Arrays;

public class CommonMethods {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    static final float VAL = 1.0f;

    static float[] getFloatArray(int size, float value) {
        float[] array = new float[size];
        Arrays.fill(array, value);
        return array;
    }

}
