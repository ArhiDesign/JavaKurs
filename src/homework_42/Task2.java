package homework_42;

import java.util.HashMap;
import java.util.Map;

/*
Task 2
Подсчет слов по длине
Напишите программу, которая подсчитывает количество слов определенной длины в заданном тексте (строке).
Инструкции:
Используйте HashMap<Integer, Integer>, где ключом является длина слова,
 а значением — количество слов этой длины.
Прочитайте текст и обновите карту соответствующим образом.
Выведите результаты подсчета.
 */
public class Task2 {
    public static void main(String[] args) {

        String text = "Напишите программу, которая подсчитывает количество слов.";

             Map<Integer, Integer> wordLengthCount = new HashMap<>();

        String[] words = text.trim().replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        // Перебираем все слова и обновляем карту
        for (String word : words) {

            int length = word.length();

            // Обновляем карту, увеличивая кол. слов для этой длины на 1
            wordLengthCount.put(length, wordLengthCount.getOrDefault(length, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
            System.out.println("Длина слова: " + entry.getKey() + " — Количество слов: " + entry.getValue());
        }
    }
}
