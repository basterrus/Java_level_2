package Lesson_3.task_2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        //Генерируем данные для книжки
        for (int i = 0; i < 10; i++) {
            phoneBook.addItem("Human"+i, "8800555353"+i);
        }
        phoneBook.addItem("Human0", "88005553555");
        phoneBook.addItem("Human3", "88005556666");

        //Выводим значения по имени
        System.out.println(phoneBook.getName("Human0"));
        System.out.println(phoneBook.getName("Human2"));
        System.out.println(phoneBook.getName("Human3"));
        }
    }

