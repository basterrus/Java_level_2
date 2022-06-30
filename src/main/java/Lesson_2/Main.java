package Lesson_2;

import Lesson_2.myExeptions.MyArrayDataException;
import Lesson_2.myExeptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"13", "2", "56", "25"},
                {"4", "7", "-55", "71"},
                {"94", "1", "11", "48"},
                {"-38", "5", "6", "e54"}
        };

        try {
            summaryArrayElements(array);
            anyFunction(array);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void summaryArrayElements(String[][] array) throws MyArrayDataException {
        int summary = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4)
                throw new MyArrayDataException("Ошибка: размер массива не соответствует заданному!");
            for (int j = 0; j < array[i].length; j++) {
                try {
                    summary += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("В ячейке [" + i + "]" + "[" + j + "]" + " не содержится число");
                }
            }
        }
        System.out.println("Сумма элементов массива равна: " + summary);
    }

    public static void anyFunction(String[][] array) throws MyArraySizeException {
        if (array.length != 4)
            throw new MyArraySizeException("Ошибка: размер массива не соответствует заданному!");

    }


}
