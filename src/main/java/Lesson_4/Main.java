package Lesson_4;

import java.util.Arrays;

import static Lesson_4.DoubleMethods.doubleThreadMethod;
import static Lesson_4.DoubleMethods.doubleThreadMethod1;
import static Lesson_4.SingleMethods.*;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        System.out.println(Arrays.equals(singleThreadMethod(), doubleThreadMethod()));
        System.out.println(Arrays.equals(singleThreadMethod(), doubleThreadMethod1()));
    }
}
