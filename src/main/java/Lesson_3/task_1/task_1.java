package Lesson_3.task_1;

import java.util.HashMap;

public class task_1 {
    public static void main(String[] args) {
        String[] words = new String[]{"Cat", "Dog", "Horse", "Dog", "Cat", "Cat", "Duck", "Gofer", "Pig", "Pig", "Horse"};
        HashMap<String, Integer> tempMap = new HashMap<>();

        for (String word : words) {
            tempMap.put(word, tempMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(tempMap);

    }
}


