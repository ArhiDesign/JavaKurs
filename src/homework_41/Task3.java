package homework_41;

import java.util.HashMap;
import java.util.Map;

/*
Task 3
Пересечение двух карт: Реализуйте метод, который принимает две карты Map<String, Integer>
и возвращает новую карту, содержащую только те записи, ключи которых присутствуют в обеих исходных картах.
 Для совпадающих ключей значение можно брать из любой карты

 Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
Copy
//Output
banana: 20
cherry: 30
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);

        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Создаем новую карту для хранения пересечения
        Map<String, Integer> intersectionMap = new HashMap<>();

        // Перебираем ключи первой карты
        for (String key : map1.keySet()) {
            // Если ключ есть и во второй карте, добавляем его в результирующую карту
            if (map2.containsKey(key)) {
                // Значение можно взять из любой карты (например, из map1)
                intersectionMap.put(key, map1.get(key));
            }
        }

        return intersectionMap;

    }
}