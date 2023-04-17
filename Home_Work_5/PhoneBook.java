/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может
иметь несколько телефонов.
Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.

Реализовать алгоритм пирамидальной сортировки (HeapSort). */

package Home_Work_5;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, PriorityQueue<String>> phoneBook = new HashMap<>();
        String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};

        for (String employee : employees) {
            String[] fullName = employee.split(" ");
            String firstName = fullName[0];
            String lastName = fullName[1];
            String phoneNumber = generatePhoneNumber();
            if (!phoneBook.containsKey(firstName + " " + lastName)) {
                phoneBook.put(firstName + " " + lastName, new PriorityQueue<>());
            }
            phoneBook.get(firstName + " " + lastName).add(phoneNumber);
        }

        PriorityQueue<Map.Entry<String, Integer>> popularityQueue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, PriorityQueue<String>> entry : phoneBook.entrySet()) {
            int count = entry.getValue().size();
            if (count > 1) {
                popularityQueue.add(Map.entry(entry.getKey(), count));
            }
        }

        while (!popularityQueue.isEmpty()) {
            Map.Entry<String, Integer> entry = popularityQueue.poll();
            System.out.println(entry.getKey() + " - " + entry.getValue() + " телефонов");
        }
    }

    private static String generatePhoneNumber() {
        StringBuilder sb = new StringBuilder("+7");
        for (int i = 0; i < 10; i++) {
            sb.append((int) (Math.random() * 10));
        }
        return sb.toString();
    }
}