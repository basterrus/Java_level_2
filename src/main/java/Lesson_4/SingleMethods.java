package Lesson_4;

import static Lesson_4.CommonMethods.VAL;
import static Lesson_4.CommonMethods.getFloatArray;
import static java.lang.Long.SIZE;

public class SingleMethods {


    static float[] singleThreadMethod() {
        float[] arr = getFloatArray(SIZE, VAL);
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) ((arr[i] * Math.sin(0.2f + i / 5.0)) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0));
        }
        long finish = System.currentTimeMillis();
        System.out.printf("Total time of single-thread method: %d ms\n", (finish - start));
        return arr;
    }





}
