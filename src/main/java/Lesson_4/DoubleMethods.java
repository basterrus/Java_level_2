package Lesson_4;

import java.util.Arrays;

import static Lesson_4.CommonMethods.*;

public class DoubleMethods {
    static float[] doubleThreadMethod() throws InterruptedException {
        float[] arr = getFloatArray(SIZE, VAL);
        long start = System.currentTimeMillis();

        createThreads(arr);
        long finish = System.currentTimeMillis();
        System.out.printf("Total time of double-thread method: %d ms\n", (finish - start));

        return arr;
    }


    static float[] doubleThreadMethod1() throws InterruptedException {
        float[] arr = getFloatArray(SIZE, VAL);
        long start = System.currentTimeMillis();
        float[] halfArr = Arrays.copyOf(arr, arr.length);

        createThreads(arr);

        for (int i = HALF; i < SIZE; i++) {
            arr[i] = halfArr[i];
        }
        long finish = System.currentTimeMillis();
        System.out.printf("Total time of double-thread method: %d ms\n", (finish - start));
        return arr;
    }

    private static void createThreads(float[] arr) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < HALF; i++) {
                arr[i] = (float) ((arr[i] * Math.sin(0.2f + i / 5.0)) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = HALF; i < SIZE; i++) {
                arr[i] = (float) ((arr[i] * Math.sin(0.2f + i / 5.0)) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0));
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
