package Lesson_3.task_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> pb = new HashMap<>();

    public void addItem(String name, String phone) {
        Set<String> phones = pb.getOrDefault(name, new HashSet<>());
        phones.add(phone);
        pb.put(name, phones);
    }
    public Set<String> getName(String name){
        return pb.get(name);
    }
}
